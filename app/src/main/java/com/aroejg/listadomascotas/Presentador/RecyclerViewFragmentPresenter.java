package com.aroejg.listadomascotas.Presentador;

import android.content.Context;

import com.aroejg.listadomascotas.Mascota;
import com.aroejg.listadomascotas.db.ConstructorMascotas;
import com.aroejg.listadomascotas.iRecyclerViewFragmentView;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements iRecyclerViewFragmentPresenter{

    private com.aroejg.listadomascotas.iRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;


    public RecyclerViewFragmentPresenter (iRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();

    }

    @Override
    public void obtenerMascotasBaseDatos() {
                constructorMascotas = new ConstructorMascotas(context);
                mascotas = constructorMascotas.obtenerDatos();
                mostrarMascotasRV();

    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();

    }
}
