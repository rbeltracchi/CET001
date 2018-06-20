
package com.cet001.icaro;


public class Operador extends Empleado{
    private double sueldo;
    private int id;

    public Operador(String nombre, String apellido, String dni, int nroLegajo,double sueldo,int id) {
        super(nombre, apellido, dni, nroLegajo);
        this.sueldo = sueldo;
        this.id = id;
    }
    
    @Override
    public void calcularSueldo() {
     this.getSueldo();        
    }
    
    @Override
    public String toString(){
       return super.toString()+",sueldo="+this.sueldo+" ,id operador="+this.id;
    }
    //métodos setters & getters
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
