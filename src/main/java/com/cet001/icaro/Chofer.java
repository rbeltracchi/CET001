
package com.cet001.icaro;


public class Chofer extends Empleado {
    private double comision;
    private int id;

    public Chofer(String nombre, String apellido, String dni, int nroLegajo,double comision,int id) {
        super(nombre, apellido, dni, nroLegajo);
        this.comision = comision;
        this.id = id;
    }

    @Override
    public void calcularSueldo() {
      // ??????  de dónde toma la lista de viajes por un lapso de días a definir, para calcular sueldo??????
    }
    
    @Override
    public String toString(){
     return super.toString()+", comision="+this.comision+", id chofer="+this.id;
    }
    //métodos setters & getters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
