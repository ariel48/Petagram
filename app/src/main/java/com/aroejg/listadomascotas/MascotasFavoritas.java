package com.aroejg.listadomascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList <Mascota> favoritas;
    private RecyclerView listafavoritas;
    private Toolbar favActionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);



    androidx.appcompat.widget.Toolbar favActionBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
    setSupportActionBar(favActionBar);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setHomeAsUpIndicator(R.drawable.pet_icon_png_7);


    listafavoritas = (RecyclerView) findViewById(R.id.rvFavoritas);

    LinearLayoutManager llm = new LinearLayoutManager(this);
    llm.setOrientation(LinearLayoutManager.VERTICAL);
    listafavoritas.setLayoutManager(llm);
    inicializaListaMascotas();
    inicializarAdaptador();


    }


    public MascotaAdaptador adaptador;

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(favoritas, this);
        listafavoritas.setAdapter(adaptador);

    }

    public void inicializaListaMascotas(){

        favoritas = new ArrayList<Mascota>();
        favoritas.add(new Mascota("Flucky",R.drawable.dog3, "4"));
        favoritas.add(new Mascota("Laika",R.drawable.dog,"3"));
        favoritas.add(new Mascota("Catty",R.drawable.dog2, "5"));
        favoritas.add(new Mascota("Rony",R.drawable.dog,"6"));
        favoritas.add(new Mascota("Benjamin",R.drawable.dog4,"8"));


    }


}