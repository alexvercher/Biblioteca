package com.cice.clases.tiposVarios;

import com.cice.clases.biblioTipo.BiblioPapel;

public class Comics extends BiblioPapel {

    private int numero;
    private String coleccion;

    public Comics(String fecha_publicacion, String nombre, int numero, String coleccion) {
        super(fecha_publicacion, nombre);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}
