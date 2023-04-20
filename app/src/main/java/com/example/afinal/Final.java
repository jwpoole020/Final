package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class Final extends AppCompatActivity {

    int floor;
    int table;
    int pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        updatePizzaria();

    }

    public void updatePizzaria(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        floor = sp.getInt("floor", 0);
        table = sp.getInt("table", 0);
        pizza = sp.getInt("pizza", 0);
    }
}