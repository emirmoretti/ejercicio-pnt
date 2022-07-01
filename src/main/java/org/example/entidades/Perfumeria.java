package org.example.entidades;

public class Perfumeria extends Producto{

    private Double contenido;

    public Perfumeria(){

    }

    public Perfumeria(Double contenido) {
        this.contenido = contenido;
    }

    public Perfumeria(String nombre, Integer precio, Double contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Double getContenido() {
        return contenido;
    }

    public void setContenido(Double contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString().concat(" /// " + "Contenido: " + contenido + "ml").concat(" /// " + " Precio: $" + getPrecio());
    }
}
