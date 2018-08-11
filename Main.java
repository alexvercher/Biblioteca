package com.cice.clases;

import com.cice.clases.biblioTipo.Biblioteca;
import com.cice.clases.tiposVarios.Comics;
import com.cice.clases.tiposVarios.Disco;
import com.cice.clases.tiposVarios.Libros;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Biblioteca> lista = new ArrayList<>();
        List<Boolean> listaStatus = new ArrayList<>();
        Disco disco = new Disco("Disco", "CD", 60, "Warner", "Melendi");

        listaStatus.add(disco.prestar());


        lista.add(disco);
        lista.add(new Comics("AntMan","Enero/18",1,"Marvel"));
        lista.add(new Libros("1615-01-01", "El Quijote", 1615, "ISBN", "Miguel de Cervantes Saavedra"));

        for (Biblioteca recurso : lista) {
/*
            IPrestable prestable = (IPrestable) recurso;
            if(prestable.esPrestado()){
                System.out.println(prestable.toString());
            } else {
                System.out.println(prestable.toString());
            }
*/

            if (recurso instanceof IPrestable) {
                System.out.print("PRESTABLE: ");
                if(((IPrestable) recurso).esPrestado()){
                    System.out.println(recurso.toString());
                } else {
                    System.out.println(recurso.toString());
                }
            } else {
                System.out.print("NO PRESTABLE: ");
                System.out.println(recurso.toString());
            }

        }
    }
}
