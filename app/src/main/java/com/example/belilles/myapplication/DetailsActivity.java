package com.example.belilles.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class DetailsActivity extends AppCompatActivity {

    TextView textViewName2;
    TextView textViewClass2;
    TextView textViewDescription2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        //INSTITUTO
        String url = "http://192.168.201.42:40000/api/" + CharacterActivity.personaje;
        //CASA
        //String url = "http://192.168.1.35:40000/api/" + MainActivity.personaje;
        RequestQueue requestQueue;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest

                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    TextView textViewName2 = (TextView) findViewById(R.id.textViewName2);
                    TextView textViewClass2 = (TextView) findViewById(R.id.textViewClass2);
                    TextView textViewDescription2 = (TextView) findViewById(R.id.textViewDescription2);
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            textViewName2.setText(response.getString("name"));
                            textViewClass2.setText(response.getString("class"));
                            textViewDescription2.setText(response.getString("description"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        textViewName2.setText("Error: " + error.toString());
                    }
                });


        requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(jsonObjectRequest);


    }

}
