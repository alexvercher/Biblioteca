package com.cice.clases.tiposVarios;

import com.cice.clases.biblioTipo.BiblioPapel;

public class Revistas extends BiblioPapel {

    private int numero;
    private String periodicidad;

    public Revistas(String fecha_publicacion, String nombre, int numero, String periodicidad) {
        super(fecha_publicacion, nombre);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
