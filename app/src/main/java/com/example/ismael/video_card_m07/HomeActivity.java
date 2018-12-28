package com.example.ismael.video_card_m07;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ismael.video_card_m07.Dataset.Seccion;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<Seccion> lista_Secciones;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    construirReccycler();

    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_list: Utilitdades.visualizacion= Utilitdades.LIST;
                break;
            case R.id.button_grid: Utilitdades.visualizacion=Utilitdades.GRID;
                break;
        }
    construirReccycler();
    }

    private void construirReccycler() {
        lista_Secciones = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_home);
        if (Utilitdades.visualizacion==Utilitdades.LIST){
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }else{
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }

        llenarSeccion();

        AdapterDatos adapterDatos=new AdapterDatos(lista_Secciones);
        recyclerView.setAdapter(adapterDatos);
    }

    private void llenarSeccion(){
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));
        lista_Secciones.add(new Seccion("Spyro",R.drawable.spyro));



    }

                                                /*for (int i = 0; i <110 ; i++) {
                                                    lista_Secciones.add("DATO "+i);
                                                }
                                                AdapterDatos adapter=new AdapterDatos(lista_Secciones);
                                                recyclerView.setAdapter(adapter);*/



}
