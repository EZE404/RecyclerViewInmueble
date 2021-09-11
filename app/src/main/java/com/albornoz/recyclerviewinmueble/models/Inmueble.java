package com.albornoz.recyclerviewinmueble.models;

public class Inmueble {

    private int cantAmbientes;
    private boolean disponible;
    private String direccion;
    private double precio;
    private int idFoto;

    public Inmueble(String direccion, double precio, int idFoto, int cantAmbientes, boolean disponible) {
        this.direccion = direccion;
        this.precio = precio;
        this.idFoto = idFoto;
        this.cantAmbientes = cantAmbientes;
        this.disponible = disponible;
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

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
