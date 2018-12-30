//package com.example.ismael.video_card_m07;
//
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.GridLayoutManager;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.widget.LinearLayout;
//import android.widget.Toast;
//
//import com.example.ismael.video_card_m07.Dataset.Seccion;
//
//import java.util.ArrayList;
//
//public class HomeActivity extends AppCompatActivity {
//
//    ArrayList<Seccion> lista_VideoNotas;
//    RecyclerView recyclerVideonotas;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//
//
//    construirReccycler();
//
//    }
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button_list1: Utilitdades.visualizacion= Utilitdades.LIST;
//                break;
//            case R.id.button_grid1: Utilitdades.visualizacion=Utilitdades.GRID;
//                break;
//        }
//    construirReccycler();
//    }
//
//    private void construirReccycler() {
//        lista_VideoNotas = new ArrayList<>();
//        recyclerVideonotas = (RecyclerView) findViewById(R.id.recyclerView_home);
//        if (Utilitdades.visualizacion==Utilitdades.LIST){
//            recyclerVideonotas.setLayoutManager(new LinearLayoutManager(this));
//        }else{
//            recyclerVideonotas.setLayoutManager(new GridLayoutManager(this, 2));
//        }
//
//        llenarSeccion();
//
//        AdapterDatos adapterDatos=new AdapterDatos(lista_VideoNotas);
//        adapterDatos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"SELECCIÓN: "
//                        + lista_VideoNotas.get(recyclerVideonotas.getChildAdapterPosition(v))
//                        .getNombre(),Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        recyclerVideonotas.setAdapter(adapterDatos);
//    }
//
//
//
//
//
//
//
//
//
//
//    private void llenarSeccion(){
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//        lista_VideoNotas.add(new Seccion("Spyro",R.drawable.spyro));
//
//
//
//    }
//
//                                                /*for (int i = 0; i <110 ; i++) {
//                                                    lista_VideoNotas.add("DATO "+i);
//                                                }
//                                                AdapterDatos adapter=new AdapterDatos(lista_VideoNotas);
//                                                recyclerVideonotas.setAdapter(adapter);*/
//}
