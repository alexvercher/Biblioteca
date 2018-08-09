package com.cice.clases.tiposVarios;

import com.cice.clases.biblioTipo.BiblioPapel;
import com.cice.clases.interfaces.IPrestable;

public class Libros extends BiblioPapel implements IPrestable {

    private int edicion;
    private String isbn;
    private String autor;
    //Añadida debido a la implementación de la interfaz. Nada me obliga a crearla salvo la
    //documentación que hayamos podido crear para ayudar a la implementacion por parte del
    //desarrollador.
    private boolean estaPrestado;

    public Libros(String fecha_publicacion, String nombre, int edicion, String isbn, String autor) {
        super(fecha_publicacion, nombre);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean prestar() {
        if (esPrestado()) {
            return false;
        }else{
            this.estaPrestado = true;
            return true;
        }
    }

    public boolean devolver() {
        if (!esPrestado()){
            return false;
        }else {
            this.estaPrestado = false;
            return true;
        }
    }

    public boolean esPrestado() {
        return this.estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + getNombre() + '\'' +
                ", fechaPublicacion='" + getFecha_publicacion() + '\'' +
                ", isbn='" + isbn + '\'' +
                ", edicion='" + edicion + '\'' +
                ", autor='" + autor + '\'' +
                ", estaPrestado=" + estaPrestado +
                "} " + super.toString();
    }
}
