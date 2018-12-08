package com.example.knight.uicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        TextView textView=  findViewById(R.id.textView4);
        textView.setText(Objects.requireNonNull(getIntent().getExtras()).getString("key"));
    }
}
