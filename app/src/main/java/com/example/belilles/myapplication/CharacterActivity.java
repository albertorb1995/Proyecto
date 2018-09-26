package com.example.belilles.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class CharacterActivity extends AppCompatActivity {


    ImageButton imageButtonNazeebo;
    ImageButton imageButtonNova;
    ImageButton imageButtonGenji;
    ImageButton imageButtonSylvanas;
    ImageButton imageButtonValla;
    ImageButton imageButtonDiablo;
    ImageButton imageButtonMefisto;

    public static String personaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //NAZEEBO
        ImageButton imageButtonNazeebo = (ImageButton) findViewById(R.id.imageButtonNazeebo);
        imageButtonNazeebo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "nazeebo";
                startActivity(intent);

            }
        });

        //NOVA
        ImageButton imageButtonNova = (ImageButton) findViewById(R.id.imageButtonNova);
        imageButtonNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "nova";
                startActivity(intent);
            }
        });

        //NOVA
        ImageButton imageButtonGenji = (ImageButton) findViewById(R.id.imageButtonGenji);
        imageButtonGenji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "genji";
                startActivity(intent);
            }
        });

        //SYLVANAS
        ImageButton imageButtonSylvanas = (ImageButton) findViewById(R.id.imageButtonSylvanas);
        imageButtonSylvanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "sylvanas";
                startActivity(intent);
            }
        });

        //VALLA
        ImageButton imageButtonValla = (ImageButton) findViewById(R.id.imageButtonValla);
        imageButtonValla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "valla";
                startActivity(intent);

            }
        });

        //DIABLO
        ImageButton imageButtonDiablo = (ImageButton) findViewById(R.id.imageButtonDiablo);
        imageButtonDiablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "diablo";
                startActivity(intent);

            }
        });

        //MEFISTO
        ImageButton imageButtonMefisto = (ImageButton) findViewById(R.id.imageButtonMefisto);
        imageButtonMefisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "mefisto";
                startActivity(intent);

            }
        });




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
