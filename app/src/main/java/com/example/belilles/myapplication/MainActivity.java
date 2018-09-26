package com.example.belilles.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button buttonMenuRandom;
    Button buttonMenuCharacters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IR A RANDOM
        Button buttonMenuRandom = (Button) findViewById(R.id.buttonMenuRandom);
        buttonMenuRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), RandomActivity.class);
                startActivity(intent);

            }
        });

        //IR A PERSONAJES
        Button buttonMenuCharacters = (Button) findViewById(R.id.buttonMenuCharacters);
        buttonMenuCharacters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), CharacterActivity.class);
                startActivity(intent);

            }
        });

    }
}
