package ej3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaLibros l = new ListaLibros();
        l.addLibro(new Libro("a", "a", 900));
        l.addLibro(new Libro("b", "b", 1000));
        l.addLibro(new Libro("c", "c", 1100));
        List<Libro> libroMil = l.masDeMilPaginas();
        System.out.println(libroMil.toString());
    }
}
