package com.example.imageviewdemo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.img1){
            Toast.makeText(MainActivity.this,"Image one is clicked",Toast.LENGTH_LONG).show();
        } else if (v.getId() == R.id.img2) {
            Toast.makeText(MainActivity.this,"Image two is clicked",Toast.LENGTH_LONG).show();
        }


    }
}