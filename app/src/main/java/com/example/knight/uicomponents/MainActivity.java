package com.example.knight.uicomponents;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.IAgree:
                if(checked){
                    Toast toast = Toast.makeText(this,"Agree", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            case R.id.checkBox2:
                if(checked){
                    Toast toast = Toast.makeText(this,"Not Sure", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            case R.id.checkBox3:
                if(checked){
                    Toast toast = Toast.makeText(this,"Nope", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
        }
    }

    public void goToPageThree(View view) {
        EditText editText = findViewById(R.id.editText);
        Intent intent = new Intent(MainActivity.this,ActivityThree.class);
        intent.putExtra("key",editText.getText().toString());
        startActivity(intent);
    }
}
