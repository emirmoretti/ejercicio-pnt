package org.example.entidades;

public abstract class Producto implements Comparable<Producto> {

    private String nombre;
    private Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        if(this.getPrecio() < o.getPrecio()){
            return 1;
        } else if (this.getPrecio() > o.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
