package com.aroejg.listadomascotas;

import android.os.Bundle;

import android.widget.EditText;

import java.util.Properties;
//import javax.mail.*;
//import javax.*;


import androidx.appcompat.app.AppCompatActivity;






public class ContactoActivity extends AppCompatActivity {

    EditText etNombreContacto;
    EditText etMailContacto;
    EditText etComentarioContacto;
    String correo;
    String contrasena;
    //javax.Session session;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

    etNombreContacto = findViewById(R.id.etNombreContacto);
    etMailContacto = findViewById(R.id.etMailContacto);
    etComentarioContacto = findViewById(R.id.etComentarioContacto);





    }
}