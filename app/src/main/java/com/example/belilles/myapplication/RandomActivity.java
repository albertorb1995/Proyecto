package com.example.belilles.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {


    ImageView imageViewRandom;

    ImageButton imageButtonRandom;

    Random r;

    Integer[] images = {
            R.drawable.abathurp,
            R.drawable.alafelizp,
            R.drawable.alarakp,
            R.drawable.alexstraszap,
            R.drawable.anap,
            R.drawable.anubarakp,
            R.drawable.artanisp,
            R.drawable.arthasp,
            R.drawable.aurielp,
            R.drawable.azmodanp,
            R.drawable.carnicerop,
            R.drawable.cassiap,
            R.drawable.chenp,
            R.drawable.chogallp,
            R.drawable.cringrisp,
            R.drawable.cromip,
            R.drawable.deckardp,
            R.drawable.dehakap,
            R.drawable.diablop,
            R.drawable.dvap,
            R.drawable.etcp,
            R.drawable.falstadp,
            R.drawable.fenixp,
            R.drawable.garroshp,
            R.drawable.gazlowep,
            R.drawable.genjip,
            R.drawable.guldanp,
            R.drawable.hanzop,
            R.drawable.illidanp,
            R.drawable.jainap,
            R.drawable.johannap,
            R.drawable.junkratp,
            R.drawable.kaelthasp,
            R.drawable.kelthuzadp,
            R.drawable.kerriganp,
            R.drawable.kharazimp,
            R.drawable.leoricp,
            R.drawable.lilip,
            R.drawable.limingp,
            R.drawable.luciop,
            R.drawable.lunarap,
            R.drawable.maievp,
            R.drawable.malfurionp,
            R.drawable.malthaelp,
            R.drawable.martillop,
            R.drawable.medivhp,
            R.drawable.mefistop,
            R.drawable.melenablancap,
            R.drawable.moralesp,
            R.drawable.muradinp,
            R.drawable.murkyp,
            R.drawable.nazeebop,
            R.drawable.novap,
            R.drawable.puntosp,
            R.drawable.ragnarosp,
            R.drawable.raynorp,
            R.drawable.rehgarp,
            R.drawable.rexxarp,
            R.drawable.samurosp,
            R.drawable.sondiusp,
            R.drawable.sonyap,
            R.drawable.stukovp,
            R.drawable.sylvanasp,
            R.drawable.tassadarp,
            R.drawable.thrallp,
            R.drawable.tracerp,
            R.drawable.tychusp,
            R.drawable.tyraelp,
            R.drawable.tyrandep,
            R.drawable.utherp,
            R.drawable.valeerap,
            R.drawable.vallap,
            R.drawable.varianp,
            R.drawable.vikingsp,
            R.drawable.vulcanop,
            R.drawable.xulp,
            R.drawable.yrelp,
            R.drawable.zagarap,
            R.drawable.zaryap,
            R.drawable.zeratulp,
            R.drawable.zuljinp
    };

    int pickedImage = 0, lastPicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        imageViewRandom = (ImageView) findViewById(R.id.imageViewRandom);

        imageButtonRandom = (ImageButton) findViewById(R.id.imageButtonRandom);

        r = new Random();


        imageButtonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //remove duplicates
                do {
                    pickedImage = r.nextInt(images.length);
                } while (pickedImage == lastPicked);


                    lastPicked = pickedImage;
                //display random image
                    imageViewRandom.setImageResource(images[pickedImage]);


            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
