package ej3;

import ej3.Libro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListaLibros {

    private Collection<Libro> libros;

    public ListaLibros() {
        libros = new ArrayList<>();
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public List<Libro> masDeMilPaginas() {
        return libros.stream()
                        .filter(l -> l.getHojas() >= 1000)
                        .collect(Collectors.toList());
    }

}
