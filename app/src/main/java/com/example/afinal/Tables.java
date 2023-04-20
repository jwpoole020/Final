package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tables extends AppCompatActivity {

    ImageButton buttonCir;
    ImageButton buttonBooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        buttonCir=findViewById(R.id.buttonCir);
        buttonBooth=findViewById(R.id.buttonBooth);

        buttonCir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Pizza.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("table", 0);
                editor.commit();
                startActivity(i);
            }
        });

        buttonBooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Pizza.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("table", 1);
                editor.commit();
                startActivity(i);
            }
        });
    }
}