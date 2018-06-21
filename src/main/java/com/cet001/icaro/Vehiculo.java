
package com.cet001.icaro;


class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected boolean enViaje;
    protected String patente;
    
    /*no incluímos en el constructor atributo "enViaje" xq no en todos los casos se tiene o necesita esa información al
    instanciar un objeto de la Clase Vehiculo*/
    public Vehiculo(String marca, String modelo, int anio, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "marca=" + marca + ", modelo=" + modelo +  ", anio=" + anio + ", patente=" + patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEnViaje() {
        return enViaje;
    }

    public void setEnViaje(boolean enViaje) {
        this.enViaje = enViaje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    
    
}
