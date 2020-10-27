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

import com.aroejg.listadomascotas.Presentador.RecyclerViewFragmentPresenter;
import com.aroejg.listadomascotas.Presentador.iRecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment implements iRecyclerViewFragmentView{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private iRecyclerViewFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }



    /*
    public void inicializaListaMascotas(){



    }
*/

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());

        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
