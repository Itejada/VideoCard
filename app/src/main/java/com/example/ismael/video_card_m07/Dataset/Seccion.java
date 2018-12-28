package com.example.ismael.video_card_m07.Dataset;

import android.widget.ImageView;

public class Seccion {
    private int imagen;
    private String nombre;

    public Seccion(String nombre,  int foto){
        this.nombre=nombre;
        this.imagen=foto;
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
