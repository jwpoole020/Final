package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Floor extends AppCompatActivity {

    ImageButton buttonRed;
    ImageButton buttonCar;
    ImageButton buttonBW;
    ImageButton buttonWood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);

        buttonRed=findViewById(R.id.buttonRed);
        buttonCar=findViewById(R.id.buttonCar);
        buttonBW=findViewById(R.id.buttonBW);
        buttonWood=findViewById(R.id.buttonWood);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tables.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("floor", 0);
                editor.commit();
                startActivity(i);
            }
        });

        buttonCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tables.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("floor", 1);
                editor.commit();
                startActivity(i);
            }
        });

        buttonBW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tables.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("floor", 2);
                editor.commit();
                startActivity(i);
            }
        });

        buttonWood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tables.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("floor", 3);
                editor.commit();
                startActivity(i);
            }
        });
    }
}