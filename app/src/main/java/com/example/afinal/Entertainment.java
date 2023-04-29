package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

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



    }
}