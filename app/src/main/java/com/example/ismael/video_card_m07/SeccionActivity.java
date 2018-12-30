package com.example.ismael.video_card_m07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.ismael.video_card_m07.Adapters.AdapterDatos;
import com.example.ismael.video_card_m07.Adapters.AdapterVideoNotes;
import com.example.ismael.video_card_m07.Dataset.Seccion;
import com.example.ismael.video_card_m07.Dataset.VideoNotes;

import java.util.ArrayList;

public class SeccionActivity extends AppCompatActivity {
    ArrayList<VideoNotes> lista_VideoNotas;
    RecyclerView recyclerVideonotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion2);
        lista_VideoNotas = new ArrayList<>();
        recyclerVideonotas = (RecyclerView) findViewById(R.id.recyclerView_seccion);
        recyclerVideonotas.setLayoutManager(new LinearLayoutManager(this));
        llenarSeccion();

        AdapterVideoNotes adapterVideoNotes= new AdapterVideoNotes(lista_VideoNotas);
        recyclerVideonotas.setAdapter(adapterVideoNotes);

    }


    public void onClick(View view) {

        if (view.getId() == R.id.boton_back){
            onBackPressed();

        }
    }




    private void llenarSeccion() {
        lista_VideoNotas.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        lista_VideoNotas.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        lista_VideoNotas.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        lista_VideoNotas.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        getIntent().getStringExtra("numero_seccion");
    }
    }