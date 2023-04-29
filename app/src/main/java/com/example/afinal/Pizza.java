package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pizza extends AppCompatActivity {

    Button buttonCheese;
    Button buttonPep;
    Button buttonLoaded;
    Button buttonPine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        buttonCheese=findViewById(R.id.buttonCheese);
        buttonPep=findViewById(R.id.buttonPep);
        buttonLoaded=findViewById(R.id.buttonLoaded);
        buttonPine=findViewById(R.id.buttonPine);

        buttonCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Entertainment.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("pizza", 0);
                editor.commit();
                startActivity(i);
            }
        });

        buttonPep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Entertainment.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("pizza", 1);
                editor.commit();
                startActivity(i);
            }
        });

        buttonLoaded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Entertainment.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("pizza", 2);
                editor.commit();
                startActivity(i);
            }
        });

        buttonPine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Entertainment.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("pizza", 3);
                editor.commit();
                startActivity(i);
            }
        });

    }
}