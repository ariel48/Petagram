package com.aroejg.listadomascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AcercaDeActivity extends AppCompatActivity {

    TextView tvNombreBio;
    TextView tvBioDesarrollador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);


        tvNombreBio = (TextView) findViewById(R.id.tvNombreBio);
        tvBioDesarrollador = (TextView) findViewById(R.id.tvBioDesarrollador);


    }
}