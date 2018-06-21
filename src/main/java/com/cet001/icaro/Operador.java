
package com.cet001.icaro;


public class Operador extends Empleado{
    private double sueldo;

    public Operador(String nombre, String apellido, String dni, int nroLegajo,double sueldo,String tipoEmpleado) {
        super(nombre, apellido, dni, nroLegajo,tipoEmpleado);
        this.sueldo = sueldo;
        
       
    }
    
    @Override
    public double calcularSueldo(double importe) {
     return importe;        
    }
    
    @Override
    public String toString(){
       return super.toString()+",sueldo="+this.sueldo;
    }
    //métodos setters & getters
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
}
