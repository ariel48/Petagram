package com.aroejg.listadomascotas;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.aroejg.listadomascotas.R.layout.cardview_mascota;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {


    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptador (ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;

    }


    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(cardview_mascota, parent, false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvLikes.setText(mascota.getLike());


        mascotaViewHolder.btnLikehueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Diste like a" + mascota.getNombre(),Toast.LENGTH_LONG).show();
            }
        });



    }




    @Override
    public int getItemCount() {
        return mascotas.size();
    }



    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

    private ImageView  imgFoto;
    private TextView tvNombreCV;
    private TextView tvLikes;
    private ImageButton btnLikehueso;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNonmbreCV);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikes);
            btnLikehueso = (ImageButton) itemView.findViewById(R.id.btnLikehueso);

        }
    }



}
