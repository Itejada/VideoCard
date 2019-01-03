package com.example.ismael.video_card_m07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static android.view.View.VISIBLE;

public class PLayVideoActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

    }


    @Override
    public void onClick(View v) {

        int id =v.getId();

       if(id==R.id.boton_play){
            findViewById(R.id.boton_play).setVisibility(View.GONE);
        }else if(id==R.id.videoNote){
            findViewById(R.id.boton_play).setVisibility(VISIBLE);
        }
    }
}
