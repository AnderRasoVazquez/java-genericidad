package ej5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = Supermercado.getInstance();
        supermercado.add(new Producto(2, "a", 12, LocalDate.of(2012, 12, 2)));
        supermercado.add(new Producto(2, "a", 12, LocalDate.of(2012, 12, 2)));
        supermercado.add(new Producto(2, "a", 12, LocalDate.of(2035, 12, 2)));

        System.out.println(supermercado.calcularPerdidas());
    }
}
