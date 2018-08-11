package com.cice.clases.biblioTipo;

public class BiblioPapel extends Biblioteca{

    private String fecha_publicacion;
    private String nombre;

    public BiblioPapel(String fecha_publicacion, String nombre) {
        this.fecha_publicacion = fecha_publicacion;
        this.nombre = nombre;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
