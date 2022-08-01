/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alesa
 */
public class Sucursal {
    private int idSucursal;
    private String nombreSucursal;
    
    public Sucursal(){
        this.idSucursal = 0;
        this.nombreSucursal = "";
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }


    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }


    @Override
    public String toString() {
        return getNombreSucursal();
    }
    
    
    
    
}
