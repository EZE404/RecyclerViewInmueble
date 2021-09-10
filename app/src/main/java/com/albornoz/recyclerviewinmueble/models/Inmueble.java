package com.albornoz.recyclerviewinmueble.models;

public class Inmueble {

    private String direccion;
    private double precio;
    private int idFoto;

    public Inmueble(String direccion, double precio, int idFoto) {
        this.direccion = direccion;
        this.precio = precio;
        this.idFoto = idFoto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }
}
