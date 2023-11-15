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
    
    
}
