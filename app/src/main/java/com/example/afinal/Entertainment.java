package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
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


    }
}