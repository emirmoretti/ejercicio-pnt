package org.example;

import org.example.servicios.ProductoServicio;

public class Main {

    public static void main(String[] args) {

        ProductoServicio productoServicio = new ProductoServicio();

        productoServicio.mostrarProductos();

    }
}