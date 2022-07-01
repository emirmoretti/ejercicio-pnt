package org.example.entidades;

public class Bebidas extends Producto{

    private Double litros;

    public Bebidas(){

    }

    public Bebidas(Double litros) {
        this.litros = litros;
    }

    public Bebidas(String nombre, Integer precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString().concat(" /// " + "Litros: " + litros).concat(" /// " + "Precio: $" + getPrecio());
    }
}
