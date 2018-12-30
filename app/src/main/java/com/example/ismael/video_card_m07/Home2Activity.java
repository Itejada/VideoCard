package com.example.ismael.video_card_m07;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ismael.video_card_m07.Dataset.Seccion;
import com.example.ismael.video_card_m07.Fragments.GreenFragment;
import com.example.ismael.video_card_m07.Fragments.InformacionFragment;
import com.example.ismael.video_card_m07.Fragments.RedFragment;

import java.util.ArrayList;

public class Home2Activity
        extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        RedFragment.OnFragmentInteractionListener,
        GreenFragment.OnFragmentInteractionListener,
        InformacionFragment.OnFragmentInteractionListener {

    ArrayList<Seccion> lista_Secciones;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
        */
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

/**Aqui instancio el fragment que se mostrara por defecto*/
        Fragment fragment = new GreenFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.content_home2,fragment).commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home2, menu);
        /**Aqui construiremos el recicler para que aparezca cargado al entrar*/
//        construirReccycler();

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Fragment miFragment=null;
        boolean fragmentSeleccionado=false;



        if (id == R.id.nav_camera) {
            miFragment=new GreenFragment();
            fragmentSeleccionado=true;

        } else if (id == R.id.nav_gallery) {
            miFragment=new RedFragment();
            fragmentSeleccionado=true;
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {
            miFragment=new InformacionFragment();
            fragmentSeleccionado=true;
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        if (fragmentSeleccionado==true){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_home2,miFragment).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    public void construirReccycler() {
        lista_Secciones = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_home);
        if (Utilitdades.visualizacion==Utilitdades.LIST){
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }else{
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }

        llenarSeccion();

        AdapterDatos adapterDatos=new AdapterDatos(lista_Secciones);
        adapterDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"SELECCIÓN: "
                        + lista_Secciones.get(recyclerView.getChildAdapterPosition(v))
                        .getNombre(),Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(adapterDatos);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.boton_lista: Utilitdades.visualizacion= Utilitdades.LIST;
                break;
            case R.id.boton_grid: Utilitdades.visualizacion=Utilitdades.GRID;
                break;
        }
        construirReccycler();
    }

    public void llenarSeccion(){
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,1));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,2));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,3));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,4));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,5));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,6));


    }

}