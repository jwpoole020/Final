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
    ImageView imageTable1;
    ImageView imageTable2;
    ImageView imageTable3;
    ImageView imageTable4;
    ImageView imagePizza1;
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
    Drawable hoop;
    Drawable skeeball;
    Drawable target;
    Drawable trashcan;
    Drawable vacuum;
    Drawable wetfloor;
    Drawable circle;
    Drawable sq;
    Drawable noball;
    Drawable reda;
    Drawable bluea;
    Drawable greena;
    Drawable nothing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        imageBG=findViewById(R.id.imageBG);
        imageTable1=findViewById(R.id.imageTable1);
        imagePizza1=findViewById(R.id.imagePizza1);
        imageTable2=findViewById(R.id.imageTable2);
        imagePizza2=findViewById(R.id.imagePizza2);
        imagePizza3=findViewById(R.id.imagePizza3);
        imageTable3=findViewById(R.id.imageTable3);
        imageTable4=findViewById(R.id.imageTable4);
        imagePizza4=findViewById(R.id.imagePizza4);
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
        hoop=getDrawable(R.drawable.basket);
        skeeball=getDrawable(R.drawable.skii);
        target=getDrawable(R.drawable.untitled_1);
        trashcan=getDrawable(R.drawable.trashcan);
        vacuum=getDrawable(R.drawable.vacum);
        wetfloor=getDrawable(R.drawable.wetfloor);
        circle=getDrawable(R.drawable.bpcircle);
        sq=getDrawable(R.drawable.bpsquare);
        noball=getDrawable(R.drawable.bpempty);
        reda=getDrawable(R.drawable.arcred);
        bluea=getDrawable(R.drawable.arcblue);
        greena=getDrawable(R.drawable.arcgreen);
        nothing=getDrawable(R.drawable.none);

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
        updateMachine(mach);
        updateArcade(ar);
        updateMisc(mis);
        updateBall(ball);

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
            imageTable1.setImageDrawable(tableCH);
            imageTable2.setImageDrawable(tableCH);
            imageTable3.setImageDrawable(tableCH);
            imageTable4.setImageDrawable(tableCH);
        }
        else if(i==1) {
            imageTable1.setImageDrawable(booth);
            imageTable2.setImageDrawable(booth);
            imageTable3.setImageDrawable(booth);
            imageTable4.setImageDrawable(booth);
        }
        imageTable1.setMinimumHeight(200);
        imageTable1.setMaxHeight(200);
        imageTable1.setMinimumWidth(200);
        imageTable1.setMaxWidth(200);
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
            imagePizza1.setImageDrawable(cheese);
            imagePizza2.setImageDrawable(cheese);
            imagePizza3.setImageDrawable(cheese);
            imagePizza4.setImageDrawable(cheese);
        }
        else if(i==1) {
            imagePizza1.setImageDrawable(pep);
            imagePizza2.setImageDrawable(pep);
            imagePizza3.setImageDrawable(pep);
            imagePizza4.setImageDrawable(pep);
        }
        else if(i==2) {
            imagePizza1.setImageDrawable(loaded);
            imagePizza2.setImageDrawable(loaded);
            imagePizza3.setImageDrawable(loaded);
            imagePizza4.setImageDrawable(loaded);
        }
        else if(i==3) {
            imagePizza1.setImageDrawable(pine);
            imagePizza2.setImageDrawable(pine);
            imagePizza3.setImageDrawable(pine);
            imagePizza4.setImageDrawable(pine);
        }
        imagePizza1.setMaxWidth(50);
        imagePizza1.setMinimumWidth(50);
        imagePizza1.setMaxHeight(50);
        imagePizza1.setMinimumHeight(50);
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

    public void updateMachine(int m){
        if(m==0)
            machine.setImageDrawable(hoop);
        else if(m==1)
            machine.setImageDrawable(skeeball);
        else if(m==2)
            machine.setImageDrawable(target);
        else if(m==3)
            machine.setImageDrawable(nothing);
        machine.setMaxWidth(170);
        machine.setMinimumWidth(170);
        machine.setMaxHeight(170);
        machine.setMinimumHeight(170);
    }
    public void updateArcade(int a){
        if(a==0)
            arcade.setImageDrawable(reda);
        else if(a==1)
            arcade.setImageDrawable(bluea);
        else if(a==2)
            arcade.setImageDrawable(greena);
        else if(a==3)
            arcade.setImageDrawable(nothing);
        arcade.setMaxWidth(150);
        arcade.setMinimumWidth(150);
        arcade.setMaxHeight(150);
        arcade.setMinimumHeight(150);
    }
    public void updateMisc(int t){
        if(t==0)
            misc.setImageDrawable(trashcan);
        else if(t==1)
            misc.setImageDrawable(vacuum);
        else if(t==2)
            misc.setImageDrawable(wetfloor);
        else if(t==3)
            misc.setImageDrawable(nothing);
        misc.setMaxWidth(50);
        misc.setMinimumWidth(50);
        misc.setMaxHeight(50);
        misc.setMinimumHeight(50);
    }
    public void updateBall(int b){
        if(b==0)
            ballpit.setImageDrawable(circle);
        else if(b==1)
            ballpit.setImageDrawable(sq);
        else if(b==2)
            ballpit.setImageDrawable(noball);
        else if(b==3)
            ballpit.setImageDrawable(nothing);
        ballpit.setMaxWidth(100);
        ballpit.setMinimumWidth(100);
        ballpit.setMaxHeight(100);
        ballpit.setMinimumHeight(100);

    }
}