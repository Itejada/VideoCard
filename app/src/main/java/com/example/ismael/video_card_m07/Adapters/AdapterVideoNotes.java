package com.example.ismael.video_card_m07.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.video_card_m07.Dataset.VideoNotes;
import com.example.ismael.video_card_m07.R;

import java.util.ArrayList;

public class AdapterVideoNotes  extends RecyclerView.Adapter<AdapterVideoNotes.ViewHolderVideoNotes>
implements View.OnClickListener{

        ArrayList<VideoNotes> lista_videos;
        private View.OnClickListener listener;

    public AdapterVideoNotes(ArrayList<VideoNotes> lista_videos) {
        this.lista_videos = lista_videos;
    }

    @NonNull
    @Override
    public AdapterVideoNotes.ViewHolderVideoNotes onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_secion_de_videos,null,false);

        view.setOnClickListener(this);

        return new ViewHolderVideoNotes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVideoNotes.ViewHolderVideoNotes holder, int i) {
        holder.texto.setText(lista_videos.get(i).getTextView());
        holder.imagen.setImageResource(lista_videos.get(i).getVideo());

    }

    @Override
    public int getItemCount() {
        return lista_videos.size();
    }
public void setOnclickListener(View.OnClickListener listener){
        this.listener=listener;
}
    @Override
    public void onClick(View v) {
        if(listener!= null){
            listener.onClick(v);
        }

    }

    public class ViewHolderVideoNotes extends RecyclerView.ViewHolder {

        TextView texto;
        ImageView imagen;

        public ViewHolderVideoNotes(@NonNull View itemView) {
            super(itemView);
            texto= itemView.findViewById(R.id.texto_videoNota);
            imagen= itemView.findViewById(R.id.imagen_videoNota);
        }
    }
}
