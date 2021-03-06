package com.aroejg.listadomascotas;

public class Mascota {

    private int id;
    private String nombre;
    private int foto;
    private String like;


    public Mascota(String nombre, int foto, String like) {
        this.nombre = nombre;
        this.foto = foto;
        this.like = like;
    }


    public Mascota (int foto, String like){
        this.foto =foto;
        this.like = like;
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
