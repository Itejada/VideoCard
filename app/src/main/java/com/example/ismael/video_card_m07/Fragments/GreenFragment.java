package com.example.ismael.video_card_m07.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ismael.video_card_m07.Adapters.AdapterDatos;
import com.example.ismael.video_card_m07.Dataset.Seccion;
import com.example.ismael.video_card_m07.R;
import com.example.ismael.video_card_m07.SeccionActivity;

import java.util.ArrayList;



public class GreenFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ArrayList<Seccion> lista_Secciones;
    RecyclerView recyclerView;

    public GreenFragment() {
    }


    public static GreenFragment newInstance(String param1, String param2) {
        GreenFragment fragment = new GreenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_green, container, false);
        lista_Secciones=new ArrayList<>();
        recyclerView= vista.findViewById(R.id.recyclerView_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarSeccion();
        AdapterDatos adapterDatos= new AdapterDatos(lista_Secciones);
        recyclerView.setAdapter(adapterDatos);

        adapterDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"SELECCIÓN: "
                        + lista_Secciones.get(recyclerView.getChildAdapterPosition(v))
                        .getNombre(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getContext(),SeccionActivity.class);
                intent.putExtra("numero_seccion",lista_Secciones.get(recyclerView.getChildAdapterPosition(v)).getNunmSeccion());
                startActivity(intent);

            }

        });
        return vista;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    private void llenarSeccion(){
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,1));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,2));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,3));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,4));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,5));
        lista_Secciones.add(new Seccion(getString(R.string.spyro),R.drawable.spyro,getString(R.string.spyro_detalle),R.drawable.spyro,6));



    }


}