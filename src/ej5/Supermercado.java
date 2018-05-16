package ej5;

import java.util.ArrayList;
import java.util.Collection;

public class Supermercado {
    private static Supermercado instance;
    private Collection<Producto> listaProductos;

    private Supermercado() {
        listaProductos = new ArrayList<>();
    }

    public static Supermercado getInstance() {
        if (instance == null) {
            instance = new Supermercado();
        }
        return instance;
    }

    public void add(Producto p){
        listaProductos.add(p);
    }

    public double calcularPerdidas() {
        return listaProductos.stream()
                                .filter(p -> p.estaCaducado())
                                .mapToDouble(Producto::getPrecio)
                                .sum();
    }
}
