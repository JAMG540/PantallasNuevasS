package com.example.jamg54.pantallasnuevass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CambioClave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_clave);
    }

    public void seguir(View vis){

        Intent llamada = new Intent(this, establecimientosCerca.class);


        finish();

        startActivity(llamada);
    }
}
