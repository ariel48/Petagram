package com.aroejg.listadomascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.aroejg.listadomascotas.Mascota;
import com.aroejg.listadomascotas.R;

import java.util.ArrayList;

public class ConstructorMascotas {


    private Context context;


        public ConstructorMascotas(Context context){
            this.context =context;
        }

    public ArrayList<Mascota> obtenerDatos(){

        /*ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Laika", R.drawable.dog,"3"));
        mascotas.add(new Mascota("Catty",R.drawable.dog2, "5"));
        mascotas.add(new Mascota("Flucky",R.drawable.dog3, "4"));
        mascotas.add(new Mascota("Benjamin",R.drawable.dog4,"8"));
        mascotas.add(new Mascota("Rony",R.drawable.dog,"6"));
        return  mascotas;*/

        BaseDatos db = new BaseDatos(context);
        insertarCincoMascotas(db);
        return db.obtenerTodosLasMascotas();

    }

    public void insertarCincoMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Laika");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_LIKE, "6");

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Catty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_LIKE, "5");

        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Benjamin");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog3);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_LIKE, "8");

        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Flucky");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog4);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_LIKE, "2");

        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Rony");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog5);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_LIKE, "6");

        db.insertarMascota(contentValues);

    }

}


