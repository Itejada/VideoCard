package com.example.ismael.video_card_m07.Dataset;

import java.io.Serializable;
import java.util.ArrayList;

public class Seccion implements Serializable {

    private int nunmSeccion;
    private int imagen;
    private String nombre;
    private int imagenDetalle;
    private String tituloDetalle;


    public Seccion(String nombre, int foto, String tituloDetalle, int imagenDetalle, int nunmSeccion){
        this.nunmSeccion=nunmSeccion;
        this.nombre=nombre;
        this.imagen=foto;
        this.imagenDetalle=imagenDetalle;
        this.tituloDetalle = tituloDetalle;
    }



    public int getNunmSeccion() {
        return nunmSeccion;
    }

    public void setNunmSeccion(int nunmSeccion) {
        this.nunmSeccion = nunmSeccion;
    }

    public int getImagenDetalle() {
        return imagenDetalle;
    }

    public void setImagenDetalle(int imagenDetalle) {
        this.imagenDetalle = imagenDetalle;
    }

    public String getTituloDetalle() {
        return tituloDetalle;
    }

    public void setTituloDetalle(String tituloDetalle) {
        this.tituloDetalle = tituloDetalle;
    }
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
