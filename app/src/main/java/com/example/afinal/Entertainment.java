package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Entertainment extends AppCompatActivity {

    ImageView imageMachine;
    ImageView imageMis;
    ImageView imageBP;
    ImageView imageArcade;
    RadioGroup groupMachine;
    RadioGroup groupMis;
    RadioGroup groupBP;
    RadioGroup groupArcade;
    RadioButton radioHoops;
    RadioButton radioSkee;
    RadioButton radioTar;
    RadioButton radioNone1;
    RadioButton radioTrash;
    RadioButton radioVac;
    RadioButton radioWet;
    RadioButton radioNone2;
    RadioButton radioCir;
    RadioButton radioSq;
    RadioButton radioEmpty;
    RadioButton radioNone3;
    RadioButton radioRed;
    RadioButton radioBlue;
    RadioButton radioGreen;
    RadioButton radioNone4;
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
    Button button2;
    int machine=0;
    int mis=0;
    int bp=0;
    int arc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        imageMachine=findViewById(R.id.imageMachine);
        imageMis=findViewById(R.id.imageMis);
        imageBP=findViewById(R.id.imageBP);
        imageArcade=findViewById(R.id.imageArcade);
        groupMachine=findViewById(R.id.groupMachine);
        groupMis=findViewById(R.id.groupMis);
        groupBP=findViewById(R.id.groupBP);
        groupArcade=findViewById(R.id.groupArcade);
        radioHoops=findViewById(R.id.radioHoops);
        radioSkee=findViewById(R.id.radioSkee);
        radioTar=findViewById(R.id.radioTar);
        radioNone1=findViewById(R.id.radioNone1);
        radioTrash=findViewById(R.id.radioTrash);
        radioVac=findViewById(R.id.radioVac);
        radioWet=findViewById(R.id.radioWet);
        radioNone2=findViewById(R.id.radioNone2);
        radioCir=findViewById(R.id.radioCir);
        radioSq=findViewById(R.id.radioSq);
        radioEmpty=findViewById(R.id.radioEmpty);
        radioNone3=findViewById(R.id.radioNone3);
        radioRed=findViewById(R.id.radioRed);
        radioBlue=findViewById(R.id.radioBlue);
        radioGreen=findViewById(R.id.radioGreen);
        radioNone4=findViewById(R.id.radioNone4);
        button2=findViewById(R.id.button2);

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
        none=getDrawable(R.drawable.nothing);

        groupMachine.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.radioHoops){
                    machine=0;
                    imageMachine.setImageDrawable(hoops);
                }
                else if(i==R.id.radioSkee){
                    machine=1;
                    imageMachine.setImageDrawable(skee);
                }
                else if(i==R.id.radioTar){
                    machine=2;
                    imageMachine.setImageDrawable(tar);
                }
                else if(i==R.id.radioNone1){
                    machine=3;
                    imageMachine.setImageDrawable(none);
                }
                imageMachine.setMaxHeight(100);
                imageMachine.setMinimumHeight(100);
                imageMachine.setMaxWidth(100);
                imageMachine.setMinimumWidth(100);
            }
        });

        groupMis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.radioTrash){
                    mis=0;
                    imageMis.setImageDrawable(trash);
                }
                else if(i==R.id.radioVac){
                    mis=1;
                    imageMis.setImageDrawable(vac);
                }
                else if(i==R.id.radioWet){
                    mis=2;
                    imageMis.setImageDrawable(wet);
                }
                else if(i==R.id.radioNone2){
                    mis=3;
                    imageMis.setImageDrawable(none);
                }
                imageMis.setMaxHeight(100);
                imageMis.setMinimumHeight(100);
                imageMis.setMaxWidth(100);
                imageMis.setMinimumWidth(100);
            }
        });

        groupBP.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.radioCir){
                    bp=0;
                    imageBP.setImageDrawable(cir);
                }
                else if(i==R.id.radioSq){
                    bp=1;
                    imageBP.setImageDrawable(square);
                }
                else if(i==R.id.radioEmpty){
                    bp=2;
                    imageBP.setImageDrawable(empty);
                }
                else if(i==R.id.radioNone3){
                    bp=3;
                    imageBP.setImageDrawable(none);
                }
                imageBP.setMaxHeight(100);
                imageBP.setMinimumHeight(100);
                imageBP.setMaxWidth(100);
                imageBP.setMinimumWidth(100);
            }
        });

        groupArcade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.radioRed){
                    arc=0;
                    imageArcade.setImageDrawable(red);
                }
                else if(i==R.id.radioBlue){
                    arc=1;
                    imageArcade.setImageDrawable(blue);
                }
                else if(i==R.id.radioGreen){
                    arc=2;
                    imageArcade.setImageDrawable(green);
                }
                else if(i==R.id.radioNone4){
                    arc=4;
                    imageArcade.setImageDrawable(none);
                }
                imageArcade.setMaxHeight(100);
                imageArcade.setMinimumHeight(100);
                imageArcade.setMaxWidth(100);
                imageArcade.setMinimumWidth(100);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Final.class);
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("Machine",machine);
                editor.putInt("Misc",mis);
                editor.putInt("BP",bp);
                editor.putInt("Arcade",arc);
                editor.commit();
                startActivity(i);
            }
        });
    }
}