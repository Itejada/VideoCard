package com.example.ismael.video_card_m07.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.video_card_m07.Dataset.Seccion;
import com.example.ismael.video_card_m07.R;
import com.example.ismael.video_card_m07.Utilitdades;

import java.util.ArrayList;

public class AdapterDatos
        extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>
        implements View.OnClickListener{

    ArrayList<Seccion> listaSeccion;
    private View.OnClickListener listener;

    public AdapterDatos(ArrayList<Seccion> secciones) {
        listaSeccion = secciones;
    }



    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       int layout=0;
       if ( Utilitdades.visualizacion==Utilitdades.LIST){
           layout= R.layout.lista_home_secciones;
       }else{
           layout=R.layout.grid_home_secciones;

       }
        View view= LayoutInflater.from(viewGroup.getContext())
        .inflate(layout,null,false);

       view.setOnClickListener(this);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.nombre.setVisibility(View.GONE);

        if ( Utilitdades.visualizacion==Utilitdades.LIST) {
        viewHolderDatos.nombre.setText(listaSeccion.get(i).getNombre());
        viewHolderDatos.nombre.setVisibility(View.VISIBLE);
        }
        viewHolderDatos.foto.setImageResource(listaSeccion.get(i).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaSeccion.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener= listener;
    }

    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }

    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView foto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.textView_home_list);
            foto = (ImageView) itemView.findViewById(R.id.imageView_homeList);
        }


    }
}
