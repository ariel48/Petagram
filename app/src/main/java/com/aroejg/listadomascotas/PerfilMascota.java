package com.aroejg.listadomascotas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PerfilMascota extends Fragment {



    public PerfilMascota() {
        // Required empty public constructor
    }



    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        glm.setOrientation(GridLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(glm);
        inicializaListaMascotas();
        inicializaAdaptador();

        return v;
    }

    public MascotaAdaptador adaptador;

    public void inicializaAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializaListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.golden1,"3"));
        mascotas.add(new Mascota(R.drawable.golden2, "5"));
        mascotas.add(new Mascota(R.drawable.golden3, "4"));
        mascotas.add(new Mascota(R.drawable.golden4,"8"));
        mascotas.add(new Mascota(R.drawable.golden5,"6"));
        mascotas.add(new Mascota(R.drawable.golden6,"4"));



    }




}