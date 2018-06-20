
package com.cet001.icaro;

import java.util.ArrayList;
import java.util.List;


public class Cliente { 
    private String nombre;
    private String apellido;
    private String direccion;
    private double saldo;
    private List<Telefono> telefonos;
    int id;

    public Cliente(String nombre, String apellido, String direccion, double saldo, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.saldo = saldo;
        this.id = id;
        this.telefonos= new ArrayList<>();
    }
    
    public void addTelefono(Telefono tel){
        telefonos.add(tel);
    }

    public void addSaldo(double importe){
        saldo = this.saldo + importe;
    }
    
    public void restarSaldo(double importe){
        saldo = this.saldo - importe;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", saldo=" + saldo + ", telefonos=" + telefonos + ", id=" + id + '}';
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
