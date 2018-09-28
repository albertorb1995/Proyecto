package com.example.belilles.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CharacterActivity extends AppCompatActivity {


    ImageButton imageButtonNazeebo;
    ImageButton imageButtonNova;
    ImageButton imageButtonGenji;
    ImageButton imageButtonSylvanas;
    ImageButton imageButtonValla;
    ImageButton imageButtonDiablo;
    ImageButton imageButtonMefisto;
    ImageView imageView2;

    public static String personaje;
    public static String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //NAZEEBO
        ImageButton imageButtonNazeebo = (ImageButton) findViewById(R.id.imageButtonNazeebo);
        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageButtonNazeebo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "nazeebo";

                intent.putExtra("nombre", R.drawable.nazeebop);

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

                intent.putExtra("nombre", R.drawable.novap);

                startActivity(intent);
            }
        });

        //GENJI
        ImageButton imageButtonGenji = (ImageButton) findViewById(R.id.imageButtonGenji);
        imageButtonGenji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DetailsActivity.class);
                personaje = "genji";

                intent.putExtra("nombre", R.drawable.genjip);

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

                intent.putExtra("nombre", R.drawable.sylvanasp);

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

                intent.putExtra("nombre", R.drawable.vallap);

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

                intent.putExtra("nombre", R.drawable.diablop);

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

                intent.putExtra("nombre", R.drawable.mefistop);

                startActivity(intent);

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
