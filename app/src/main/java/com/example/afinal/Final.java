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
    ImageView imageTable2;
    ImageView imageTable3;
    ImageView imageTable4;
    ImageView imagePizza;
    ImageView imagePizza2;
    ImageView imagePizza3;
    ImageView imagePizza4;
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
        imageTable2=findViewById(R.id.imageTable2);
        imagePizza2=findViewById(R.id.imagePizza2);
        buttonSO=findViewById(R.id.buttonSO);

        tileRed=getDrawable(R.drawable.redtilefinal);
        tileBG=getDrawable(R.drawable.bwtile);
        carpet=getDrawable(R.drawable.greencarpet);
        wood=getDrawable(R.drawable.woodfinal);
        booth=getDrawable(R.drawable.thumbnail_booth);
        tableCH=getDrawable(R.drawable.roundtable);
        cheese=getDrawable(R.drawable.thumbnail_cheesepizza);
        pep=getDrawable(R.drawable.thumbnail_peppizza);
        loaded=getDrawable(R.drawable.thumbnail_loaded);
        pine=getDrawable(R.drawable.thumbnail_pineapple);

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
        if(i==0) {
            imageTable.setImageDrawable(tableCH);
            imageTable2.setImageDrawable(tableCH);
            imageTable3.setImageDrawable(tableCH);
            imageTable4.setImageDrawable(tableCH);
        }
        else if(i==1) {
            imageTable.setImageDrawable(booth);
            imageTable2.setImageDrawable(booth);
            imageTable3.setImageDrawable(booth);
            imageTable4.setImageDrawable(booth);
        }
        imageTable.setMinimumHeight(200);
        imageTable.setMaxHeight(200);
        imageTable.setMinimumWidth(200);
        imageTable.setMaxWidth(200);
        imageTable2.setMinimumHeight(200);
        imageTable2.setMaxHeight(200);
        imageTable2.setMinimumWidth(200);
        imageTable2.setMaxWidth(200);
        imageTable3.setMinimumHeight(200);
        imageTable3.setMaxHeight(200);
        imageTable3.setMinimumWidth(200);
        imageTable3.setMaxWidth(200);
        imageTable4.setMinimumHeight(200);
        imageTable4.setMaxHeight(200);
        imageTable4.setMinimumWidth(200);
        imageTable4.setMaxWidth(200);
    }

    public void updatePizza(int i){
        if(i==0) {
            imagePizza.setImageDrawable(cheese);
            imagePizza2.setImageDrawable(cheese);
            imagePizza3.setImageDrawable(cheese);
            imagePizza4.setImageDrawable(cheese);
        }
        else if(i==1) {
            imagePizza.setImageDrawable(pep);
            imagePizza2.setImageDrawable(pep);
            imagePizza3.setImageDrawable(pep);
            imagePizza4.setImageDrawable(pep);
        }
        else if(i==2) {
            imagePizza.setImageDrawable(loaded);
            imagePizza2.setImageDrawable(loaded);
            imagePizza3.setImageDrawable(loaded);
            imagePizza4.setImageDrawable(loaded);
        }
        else if(i==3) {
            imagePizza.setImageDrawable(pine);
            imagePizza2.setImageDrawable(pine);
            imagePizza3.setImageDrawable(pine);
            imagePizza4.setImageDrawable(pine);
        }
        imagePizza.setMaxWidth(50);
        imagePizza.setMinimumWidth(50);
        imagePizza.setMaxHeight(50);
        imagePizza.setMinimumHeight(50);
        imagePizza2.setMaxWidth(50);
        imagePizza2.setMinimumWidth(50);
        imagePizza2.setMaxHeight(50);
        imagePizza2.setMinimumHeight(50);
        imagePizza3.setMaxWidth(50);
        imagePizza3.setMinimumWidth(50);
        imagePizza3.setMaxHeight(50);
        imagePizza3.setMinimumHeight(50);
        imagePizza4.setMaxWidth(50);
        imagePizza4.setMinimumWidth(50);
        imagePizza4.setMaxHeight(50);
        imagePizza4.setMinimumHeight(50);

    }
}