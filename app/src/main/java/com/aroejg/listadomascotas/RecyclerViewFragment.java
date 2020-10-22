package com.aroejg.listadomascotas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
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
        mascotas.add(new Mascota("Laika",R.drawable.dog,"3"));
        mascotas.add(new Mascota("Catty",R.drawable.dog2, "5"));
        mascotas.add(new Mascota("Flucky",R.drawable.dog3, "4"));
        mascotas.add(new Mascota("Benjamin",R.drawable.dog4,"8"));
        mascotas.add(new Mascota("Rony",R.drawable.dog,"6"));



    }


}
