/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_alejandro;
import Modelo.Conexion;
import vistas.*;


/**
 *
 * @author alesa
 */
public class Reto1_Alejandro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos la instancia de la vista login
        Log log = new Log();
        //2. El metodo setVisible hace visible la ventana
        log.setVisible(true);
        //System.out.println("HelloWorld");
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }
}

    
