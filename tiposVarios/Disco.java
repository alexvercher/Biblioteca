package com.cice.clases.tiposVarios;

import com.cice.clases.biblioTipo.BiblioMultimedia;
import com.cice.clases.interfaces.IPrestable;

public class Disco extends BiblioMultimedia implements IPrestable {

    private String selloDiscografico;
    private String artista;
    //Añadida debido a la implementación de la interfaz. Nada me obliga a crearla salvo la
    //documentación que hayamos podido crear para ayudar a la implementacion por parte del
    //desarrollador.
    private boolean estaPrestado;

    public Disco(String titulo, String formato, int duracion, String selloDiscografico, String artista) {
        super(titulo, formato, duracion);
        this.selloDiscografico = selloDiscografico;
        this.artista = artista;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
        return "Disco{" +
                "titulo='" + getArtista() +'\'' +
                ", formato='" + getFormato() +'\'' +
                ", duracion='" + getDuracion() +'\'' +
                ", selloDiscografico='" + selloDiscografico + '\'' +
                ", artista='" + artista + '\'' +
                ", estaPrestado=" + estaPrestado +
                '}';
    }
}
