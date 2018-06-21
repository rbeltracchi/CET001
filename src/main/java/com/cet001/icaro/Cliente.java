
package com.cet001.icaro;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Cliente { 
    private String nombre;
    private String apellido;
    private String direccion;
    private double saldo;
    private List<Telefono> telefonos= new ArrayList<>();
    private List<MovimientoDeSaldo> movSal = new ArrayList<>();
    
    public Cliente(String nombre, String apellido, String direccion, double saldo, Telefono telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.saldo = saldo;
        telefonos.add(telefono);
    }
    
    public void addTelefono(Telefono tel){
        telefonos.add(tel);
    }

    public void sumSaldo(double importe){
        saldo = this.saldo + importe;
    }
    
    public void subtractSaldo(double importe){
        saldo = this.saldo - importe;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", saldo=" + saldo + ", telefonos=" + telefonos ;
    }
   
    //métodos setters & getters
    
    public List<Telefono> getTelefonos() {
        return telefonos;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
