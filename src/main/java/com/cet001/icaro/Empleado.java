
package com.cet001.icaro;


public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected int nroLegajo;
    
    public Empleado(String nombre,String apellido,String dni,int nroLegajo){
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.nroLegajo = nroLegajo;
    }
    
    public abstract void calcularSueldo();

    @Override
    public String toString() {
        return "Empleado:" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nroLegajo=" + nroLegajo;
    }
    
    //métodos setters & getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    
}
