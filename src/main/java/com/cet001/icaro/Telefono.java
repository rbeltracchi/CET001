
package com.cet001.icaro;


class Telefono {
    private String codArea;
    private String numero;

    
    
    public Telefono(String codArea, String numero) {
        this.codArea = codArea;
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "Telefono{" + "codArea=" + codArea + ", numero=" + numero ;
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


    
    
    
}
