/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author alesa
 */
public class CoboboxSucursal {
    
    Conexion conexion = new Conexion(); 
    Connection connection;
    Statement st;
    ResultSet rs;

    public CoboboxSucursal() {
    }
    
    public ArrayList getListaSucursales(){
        
        System.out.println("Funcion getListaSucursales() ");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal; 
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT idSucursal, nombreSucursal FROM sucursal");
            while(rs.next()){
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
                mListaSucursales.add(sucursal);
            }
            
        }catch(SQLException e){
            System.out.println(e);
            
        }
        return mListaSucursales;
    }
    
    
}
