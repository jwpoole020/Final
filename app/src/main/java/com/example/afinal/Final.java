package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Final extends AppCompatActivity {

    ImageView imageBG;
    ImageView imageTable;
    ImageView imagePizza;
    Button buttonSO;
    int floor;
    int table;
    int pizza;
    Drawable tileRed;
    Drawable tileBG;
    Drawable carpet;
    Drawable wood;
    Drawable booth;
    Drawable tableCH;
    Drawable cheese;
    Drawable pep;
    Drawable loaded;
    Drawable pine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        imageBG=findViewById(R.id.imageBG);
        imageTable=findViewById(R.id.imageTable);
        imagePizza=findViewById(R.id.imagePizza);
        buttonSO=findViewById(R.id.buttonSO);
        tileRed=getDrawable(R.drawable.redtile);
        tileBG=getDrawable(R.drawable.bwtile);
        carpet=getDrawable(R.drawable.carpet);
        wood=getDrawable(R.drawable.wood);
        booth=getDrawable(R.drawable.booth);
        tableCH=getDrawable(R.drawable.circle4);
        cheese=getDrawable(R.drawable.cheese);
        pep=getDrawable(R.drawable.pepper);
        loaded=getDrawable(R.drawable.loaded);
        pine=getDrawable(R.drawable.pine);

        buttonSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        updatePizzeria();


    }

    public void updatePizzeria(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        floor = sp.getInt("floor", 0);
        table = sp.getInt("table", 0);
        pizza = sp.getInt("pizza", 0);
        updateBG(floor);
        updateTable(table);
        updatePizza(pizza);
    }

    public void updateBG(int i){
        if(i==0)
            imageBG.setImageDrawable(tileRed);
        else if(i==1)
            imageBG.setImageDrawable(carpet);
        else if(i==2)
            imageBG.setImageDrawable(tileBG);
        else if(i==3)
            imageBG.setImageDrawable(wood);
        
    }

    public void updateTable(int i){
        if(i==0)
            imageTable.setImageDrawable(tableCH);
        else if(i==1)
            imageTable.setImageDrawable(booth);
    }

    public void updatePizza(int i){
        if(i==0)
            imagePizza.setImageDrawable(cheese);
        else if(i==1)
            imagePizza.setImageDrawable(pep);
        else if(i==2)
            imagePizza.setImageDrawable(loaded);
        else if(i==3)
            imagePizza.setImageDrawable(pine);
    }
}