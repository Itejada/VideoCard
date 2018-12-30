package com.example.ismael.video_card_m07.Dataset;

import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.video_card_m07.R;

import java.util.ArrayList;

public class VideoNotes {
    private ArrayList<VideoNotes> videoNotes_list= new ArrayList();
    private int video;
    private int textView;


    public VideoNotes( int video, int textView ) {

        this.videoNotes_list=getVideoNotes_list();
        this.video = video;
        this.textView = textView;
    }

    public ArrayList<VideoNotes> getVideoNotes_list() {
        return videoNotes_list;
    }

    public void setVideoNotes_list() {
        llenar();
        this.videoNotes_list = videoNotes_list;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getTextView() {
        return textView;
    }

    public void setTextView(int textView) {
        this.textView = textView;
    }



    public void llenar(){
        videoNotes_list.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        videoNotes_list.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        videoNotes_list.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));
        videoNotes_list.add(new VideoNotes(R.drawable.spyrom,R.string.title_activity_seccion));


    }

}
