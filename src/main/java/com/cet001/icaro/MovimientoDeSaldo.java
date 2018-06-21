/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cet001.icaro;

/**
 *
 * @author ponsa
 */
public class MovimientoDeSaldo {
    private double importe;
    private int id_cliente;
    private String tipo_comprobante;
    public MovimientoDeSaldo (){
        
    }
    
    public MovimientoDeSaldo (double importe, int id_cliente, String tipo_comprobante ){
        this.id_cliente=id_cliente;
        this.importe = importe;
        this.tipo_comprobante=tipo_comprobante;
    }
    
    public double getImporte() {
        return importe;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }
    
}
