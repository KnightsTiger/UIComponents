package com.example.knight.uicomponents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPageTwo(View view) {
        startActivity(new Intent(this,PageTwo.class));
    }

    public void playIt(View view) {

/*        MediaPlayer mediaPlayer = MediaPlayer.create(this,R);
        mediaPlayer.start(); */// no need to call prepare(); create() does that for you
    }
}
