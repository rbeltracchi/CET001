
package com.cet001.icaro;

import java.util.Date;


public class Viaje {
    private String origen;
    private String destino;
    private Date fecha;
    private Vehiculo movil;
    private double importe;
    private Cliente cliente;
    private Chofer chofer;
    private int id;
    
    public Viaje(String origen,String destino,Date fecha,Vehiculo movil,Cliente cliente,Chofer chofer,int id){
       this.origen = origen;
       this.destino = destino;
       this.fecha = fecha;
       this.movil = movil;
       this.cliente = cliente;
       this.chofer = chofer;
       this.id = id;
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", movil=" + movil + ", importe=" + importe + ", cliente=" + cliente + ", chofer=" + chofer + ", id=" + id + '}';
    }
    //métodos settters & getters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getMovil() {
        return movil;
    }

    public void setMovil(Vehiculo movil) {
        this.movil = movil;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
