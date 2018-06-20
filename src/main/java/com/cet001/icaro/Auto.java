
package com.cet001.icaro;


public class Auto extends Vehiculo{
   private int cantPasajeros; 

    public Auto(String marca, String modelo, int kilometraje, int anio, String patente,int cantPasajeros) {
        super(marca, modelo, kilometraje, anio, patente);
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        return super.toString()+", cantPasajeros=" + cantPasajeros;
    }
    //métodos setters & getters
    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    
//cambio
}
