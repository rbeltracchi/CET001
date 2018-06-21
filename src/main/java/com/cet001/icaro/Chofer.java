
package com.cet001.icaro;

import java.util.Calendar;
import java.util.List;


public class Chofer extends Empleado {
    private double comision;

    public Chofer(String nombre, String apellido, String dni, int nroLegajo,double comision, String tipoEmpleado) {
        super(nombre, apellido, dni, nroLegajo,tipoEmpleado);
        this.comision = comision;
       
    }
    public double obtenerFacturacionTotal (List<Viaje> viajes, Calendar i,Calendar f){
//////        sum
//////        recorrer lista 
//////                si esta etre las fechas entra
//////                        sum importe+importe
//////        
        return 33;
    }
    
    
    
    
    @Override
    public double calcularSueldo(double totalDeViajes)  { //viene como parametro el resultado de obtener facturaciontotal
       
        return totalDeViajes * comision;

//cuando terminemos de ver en clase la forma de hacer un select por hibernate completamos este metodo
    
    
    }
    
    @Override
    public String toString(){
     return super.toString()+", comision="+this.comision;
    }
    //métodos setters & getters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
}
