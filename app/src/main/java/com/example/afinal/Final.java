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
    ImageView machine;
    ImageView arcade;
    ImageView ballpit;
    ImageView misc;
    Button buttonSO;
    int floor;
    int table;
    int pizza;
    int mach;
    int ball;
    int mis;
    int ar;
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
    Drawable hoops;
    Drawable skee;
    Drawable tar;
    Drawable trash;
    Drawable vac;
    Drawable wet;
    Drawable cir;
    Drawable square;
    Drawable empty;
    Drawable red;
    Drawable blue;
    Drawable green;
    Drawable none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        imageBG=findViewById(R.id.imageBG);
        imageTable=findViewById(R.id.imageTable);
        imagePizza=findViewById(R.id.imagePizza);
        imageTable2=findViewById(R.id.imageTable2);
        imagePizza2=findViewById(R.id.imagePizza2);
        machine=findViewById(R.id.machine);
        arcade=findViewById(R.id.arcade);
        ballpit=findViewById(R.id.ballpit);
        misc=findViewById(R.id.misc);
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
        hoops=getDrawable(R.drawable.basket);
        skee=getDrawable(R.drawable.skii);
        tar=getDrawable(R.drawable.untitled_1);
        trash=getDrawable(R.drawable.trashcan);
        vac=getDrawable(R.drawable.vacum);
        wet=getDrawable(R.drawable.wetfloor);
        cir=getDrawable(R.drawable.bpcircle);
        square=getDrawable(R.drawable.bpsquare);
        empty=getDrawable(R.drawable.bpempty);
        red=getDrawable(R.drawable.arcred);
        blue=getDrawable(R.drawable.arcblue);
        green=getDrawable(R.drawable.arcgreen);
        none=getDrawable(R.drawable.none);

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
        mach = sp.getInt("Machine", 0);
        ball = sp.getInt("BP", 0);
        mis = sp.getInt("Misc",0);
        ar = sp.getInt("Arcade",0);
        updateBG(floor);
        updateTable(table);
        updatePizza(pizza);
        updateEnter(mach, ball, ar, mis);
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

    public void updateEnter(int m, int b, int a, int t){
        if(m==0)
            machine.setImageDrawable(hoops);
        else if(m==1)
            machine.setImageDrawable(skee);
        else if(m==2)
            machine.setImageDrawable(tar);
        else if(m==3)
            machine.setImageDrawable(none);

        if(b==0)
            ballpit.setImageDrawable(cir);
        else if(b==1)
            ballpit.setImageDrawable(square);
        else if(b==2)
            ballpit.setImageDrawable(empty);
        else if(b==3)
            ballpit.setImageDrawable(none);

        if(a==0)
            arcade.setImageDrawable(red);
        else if(a==1)
            arcade.setImageDrawable(blue);
        else if(a==2)
            arcade.setImageDrawable(green);
        else if(a==3)
            arcade.setImageDrawable(none);

        if(t==0)
            misc.setImageDrawable(trash);
        else if(t==1)
            misc.setImageDrawable(vac);
        else if(t==2)
            misc.setImageDrawable(wet);
        else if(t==3)
            misc.setImageDrawable(none);

        machine.setMaxWidth(170);
        machine.setMinimumWidth(170);
        machine.setMaxHeight(170);
        machine.setMinimumHeight(170);
        arcade.setMaxWidth(150);
        arcade.setMinimumWidth(150);
        arcade.setMaxHeight(150);
        arcade.setMinimumHeight(150);
        misc.setMaxWidth(50);
        misc.setMinimumWidth(50);
        misc.setMaxHeight(50);
        misc.setMinimumHeight(50);
        ballpit.setMaxWidth(100);
        ballpit.setMinimumWidth(100);
        ballpit.setMaxHeight(100);
        ballpit.setMinimumHeight(100);
    }
}