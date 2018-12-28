package com.example.ismael.video_card_m07;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.video_card_m07.Dataset.Seccion;

import java.util.ArrayList;

public class AdapterDatos  extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{
    ArrayList<Seccion> listaSeccion;

    public AdapterDatos(ArrayList<Seccion> secciones) {
        listaSeccion = secciones;
    }



    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
        .inflate(R.layout.lista_home_secciones,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.nombre.setText(listaSeccion.get(i).getNombre());
        viewHolderDatos.foto.setImageResource(listaSeccion.get(i).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaSeccion.size();
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
