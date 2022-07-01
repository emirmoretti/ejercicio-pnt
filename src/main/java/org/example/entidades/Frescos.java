package org.example.entidades;

public class Frescos extends Producto{

    private String unidadDeVenta;

    public Frescos() {
    }

    public Frescos(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public Frescos(String nombre, Integer precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return super.toString().concat(" /// " + "Precio: $" + getPrecio()).concat(" /// " + "Unidad de venta: " + unidadDeVenta);
    }
}
