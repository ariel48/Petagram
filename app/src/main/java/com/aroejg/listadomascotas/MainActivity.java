package com.aroejg.listadomascotas;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList <Mascota> mascotas;
    private RecyclerView listaMascotas;
    private Toolbar miActionBar;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        androidx.appcompat.widget.Toolbar miActionBar =  findViewById(R.id.miActionBar);
        androidx.appcompat.widget.Toolbar toolbar = miActionBar;
        setSupportActionBar(toolbar);



        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializaListaMascotas();
        inicializaAdaptador();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFavoritas:
                break;

            case R.id.mPrincipal:
                break;

            case R.id.mStar:
                Intent intent = new Intent(this, MascotasFavoritas.class);
                startActivity(intent);
                break;

        }


        return super.onOptionsItemSelected(item);
    }

    public MascotaAdaptador adaptador;

    public void inicializaAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializaListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Laika",R.drawable.dog,"3"));
        mascotas.add(new Mascota("Catty",R.drawable.dog2, "5"));
        mascotas.add(new Mascota("Flucky",R.drawable.dog3, "4"));
        mascotas.add(new Mascota("Benjamin",R.drawable.dog4,"8"));
        mascotas.add(new Mascota("Rony",R.drawable.dog,"6"));



    }

}