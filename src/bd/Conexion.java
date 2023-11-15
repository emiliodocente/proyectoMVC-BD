/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import com.sun.jdi.connect.spi.Connection;


/**
 *
 * @author Acer
 */
public class Conexion {
    Connection conexion= null;
    void abrir(){
        try {
            Class.forName("jdbc.mysql.");
        } catch (Exception e) {
        }
    }
    
    
}
