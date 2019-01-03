package com.example.ismael.video_card_m07;

import android.content.Intent;
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
        adapterVideoNotes.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**Aqui pasaara algo cuendo le demos al elemento mostrado en el RecyclerView*/
                Toast.makeText(SeccionActivity.this,"SELECCIÓN: "+ lista_VideoNotas.get(recyclerVideonotas.getChildAdapterPosition(v)).getTextView(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SeccionActivity.this,PLayVideoActivity.class);
                startActivity(intent);

            }
        });
        recyclerVideonotas.setAdapter(adapterVideoNotes);

    }


    public void onClick(View view) {

        if (view.getId() == R.id.boton_back){
            onBackPressed();
        }else if (view.getId() == R.id.boton_lupa){
            Toast.makeText(SeccionActivity.this,"Lanza un Query a la base de datos y actualiza el recyclerView",Toast.LENGTH_SHORT).show();

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
