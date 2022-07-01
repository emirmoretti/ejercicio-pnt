package org.example.servicios;

import org.example.entidades.Bebidas;
import org.example.entidades.Frescos;
import org.example.entidades.Perfumeria;
import org.example.entidades.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductoServicio {

    public void mostrarProductos() {
        List<Producto> productos = cargarProductos();
        imprimirProductos(productos);
        productos = ordenarProductos(productos);
        productos = obtenerMayorYmenor(productos);
        imprimirProductos(productos);
    }

    public List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        Producto p1 = new Bebidas("Coca-Cola Zero", 20, 1.5);
        Producto p2 = new Bebidas("Coca-Cola", 18, 1.5);
        Producto p3 = new Perfumeria("Shampoo Sedal", 19, 500d);
        Producto p4 = new Frescos("Frutillas", 64, "Kilo");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        return productos;
    }

    public List<Producto> ordenarProductos(List<Producto> productos) {
        Collections.sort(productos);
        return productos;
    }

    public List<Producto> obtenerMayorYmenor(List<Producto> productos) {
        List<Producto> productosLista = new ArrayList<>();
        productosLista.add(productos.get(0));
        productosLista.add(productos.get(productos.size() - 1));
        return productosLista;
    }

    public void imprimirProductos(List<Producto> productos) {
        if (productos.size() > 2) {
            for (Producto pUnit : productos) {
                System.out.println(pUnit.toString());
            }
        } else {
            System.out.println("=============================");
            System.out.println("Producto más caro: " + productos.get(productos.size() - 1).getNombre());
            System.out.println("Producto más barato: " + productos.get(0).getNombre());
        }
    }
}
