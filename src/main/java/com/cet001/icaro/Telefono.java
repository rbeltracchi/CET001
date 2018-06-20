
package com.cet001.icaro;


class Telefono {
    private String codArea;
    private String numero;
    private int idCliente;

    public Telefono(String codArea, String numero, int idCliente) {
        this.codArea = codArea;
        this.numero = numero;
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Telefono{" + "codArea=" + codArea + ", numero=" + numero + ", idCliente=" + idCliente + '}';
    }

    //métodos setters & getters
    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
