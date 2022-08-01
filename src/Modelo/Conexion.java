/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author alesa
 */
public class Conexion {
    
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g53_db";
    String usuario = "root";
    String contrasena = ""; 
    
    
    public Conexion(){
           
        try{
            
        Class.forName(driver);
        connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
        System.out.println(connection);
        if(connection != null){
            System.out.println("Conexion exitosa base de datos");
            }
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("No se pudo establecer conexion");
            
            }
        }
        
        public Connection getConnection(){
            
            return connection; 
            
        }
        
    
    
}
