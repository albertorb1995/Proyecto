package com.example.belilles.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
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

    TextView textViewNameCharacter;
    TextView textViewClassCharacter;
    TextView textViewDescriptionCharacter;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView imageView2 = findViewById(R.id.imageView2);

        int idImagen = getIntent().getExtras().getInt("nombre");
        imageView2.setImageDrawable(getDrawable(idImagen));

        //INSTITUTO
        String url = "http://192.168.201.42:40000/api/" + CharacterActivity.personaje;

        //CASA
        //String url = "http://192.168.1.40:40000/api/" + CharacterActivity.personaje;
        RequestQueue requestQueue;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest

                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    TextView textViewNameCharacter = (TextView) findViewById(R.id.textViewNameCharacter);
                    TextView textViewClassCharacter = (TextView) findViewById(R.id.textViewClassCharacter);
                    TextView textViewDescriptionCharacter = (TextView) findViewById(R.id.textViewDescriptionCharacter);
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            textViewNameCharacter.setText(response.getString("name"));
                            textViewClassCharacter.setText(response.getString("class"));
                            textViewDescriptionCharacter.setText(response.getString("description"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        textViewNameCharacter.setText("Error: " + error.toString());
                    }
                });

        requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(jsonObjectRequest);

    }

}
