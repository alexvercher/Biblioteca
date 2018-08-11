package com.cice.clases.biblioTipo;

import java.util.Enumeration;

public class BiblioMultimedia extends Biblioteca{

    private String titulo;
    private String formato;
    private int duracion;

    public BiblioMultimedia(String titulo, String formato, int duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
