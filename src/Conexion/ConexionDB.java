/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author erick
 */
public class ConexionDB {
    public Connection con;
     
    public void ConexionBD(){
        establecerconexion();
    }

    public void establecerconexion() {
        String host="localhost";
        String user="root";
        String pass="";
        String basededatos="hospital";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String newConnectionURL = "jdbc:mysql://"+host+"/"+basededatos+"?"+"user="+user+"&password="+pass;
            con=DriverManager.getConnection(newConnectionURL);
            System.out.println("Conexion exitosa con la DB");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion");
        }
                
    }
    public void cerrarconexion() {
    
        try{
            con.close();
        }
        catch (Exception e) {
            System.out.println("Error al cerrar la conexion con la DB");
        }
            
        }
}
