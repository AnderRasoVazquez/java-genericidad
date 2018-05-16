package ej1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Estanteria {

    private String lugar;
    private String area;

    private Collection<Libro> libros;

    public Estanteria(String lugar, String area) {
        this.lugar = lugar;
        this.area = area;
        libros = new ArrayList<>();
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarMasCaros(int precio) {
        libros.stream()
                .filter(l -> l.getPrecio() > precio) // Libros
//                .map(l -> l.getTitulo())
                .map(Libro::getTitulo) // Strings
//                .forEach(l -> System.out.println(l));
                .forEach(System.out::println);
    }

    public void mostrarAlfabeticamente() {
        libros.stream()
                // una forma
//                .map(Libro::getTitulo) // string
//                .sorted()
//                .forEach(System.out::println);

                // otra forma
//                .sorted(Comparator.comparing(Libro::getTitulo))
//                .forEach(l -> System.out.println(l.getTitulo()));

                // otra forma
                .sorted(Comparator.comparing(Libro::getTitulo))
                .forEach(l -> System.out.println(l.getTitulo()));

                // para ordenarlos al reves
//                .sorted(Comparator.comparing(Libro::getTitulo).reversed())
//                .forEach(l -> System.out.println(l.getTitulo()));
    }
}
