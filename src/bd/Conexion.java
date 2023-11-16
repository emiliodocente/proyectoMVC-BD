/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.Pelicula;



/**
 *
 * @author SrE
 */
public class Conexion {
    Connection conexion= null;
    String PUERTO = "3308";
    String BD = "moviesDB";
    void abrir(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost:"+PUERTO+"/moviesDB","root","");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:" + PUERTO + "/"+BD+"",
                                                "root","");
            System.out.println("Conexion éxitosa");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
         public void createPelicula(Pelicula pelicula){
        this.abrir();
        try {
            String sql = "INSERT INTO `movie`(`nombre`, `director`, `anio`) VALUES (?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(sql); 
            
            ps.setString(1, pelicula.getNombre());
            ps.setString(2, pelicula.getNomDirector());
            ps.setInt(3, pelicula.getAnio());
                      
            ps.executeUpdate();
            
            System.out.println("agregado");
        } catch (Exception e) {
            
            
        }
        
    }
    public void readPelicula(){
        
    }
    public void updatePelicula(Pelicula pelicula, int idBuscado){
        this.abrir();
        try {
            String sql = "UPDATE `movie` SET `nombre`=? WHERE `id`=?";
            PreparedStatement ps = conexion.prepareStatement(sql); 
            
            ps.setString(1, pelicula.getNombre());
            
            ps.setInt(2, idBuscado);
                      
            ps.executeUpdate();
            
            System.out.println("modificado");
        } catch (Exception e) {
            
            
        }
        
        
    }
    public void deletePelicula(){
        
    }

    }
    
    
}
