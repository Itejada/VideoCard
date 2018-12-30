package com.example.ismael.video_card_m07;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ismael.video_card_m07.Fragments.GreenFragment;
import com.example.ismael.video_card_m07.Fragments.InformacionFragment;
import com.example.ismael.video_card_m07.Fragments.RedFragment;

public class MainActivity extends AppCompatActivity implements GreenFragment.OnFragmentInteractionListener,InformacionFragment.OnFragmentInteractionListener,RedFragment.OnFragmentInteractionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       startActivity(new Intent(MainActivity.this, LoginActivity.class));


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
