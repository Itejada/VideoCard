package com.example.ismael.video_card_m07.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.video_card_m07.Dataset.Seccion;
import com.example.ismael.video_card_m07.R;


public class Seccion_DetailFragment extends Fragment  {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    TextView textoDescripcion;
    ImageView imagenSeccion;

    public Seccion_DetailFragment() {
        // Required empty public constructor
    }

    public static Seccion_DetailFragment newInstance(String param1, String param2) {
        Seccion_DetailFragment fragment = new Seccion_DetailFragment();
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
        View view=inflater.inflate(R.layout.fragment_seccion__detail, container, false);

        textoDescripcion= view.findViewById(R.id.texto_seccion);
        imagenSeccion=view.findViewById(R.id.imagen_seccion);

        Bundle objetoSeccion= getArguments();
        Seccion seccion=null;

        if(objetoSeccion!=null){
            seccion=(Seccion) objetoSeccion.getSerializable("objeto");
            imagenSeccion.setImageResource(seccion.getImagenDetalle());
            textoDescripcion.setText(seccion.getTituloDetalle());
        }

        return view;
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
}
