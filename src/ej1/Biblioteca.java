package ej1;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteca {

    private String nombre;

    private Collection<Estanteria> estanterias;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        estanterias = new ArrayList<>();
    }

    public void addEstanteria(Estanteria estanteria) {
        estanterias.add(estanteria);
    }

    public void mostrarLibrosEstanterias() {
        estanterias.stream()
                .forEach(Estanteria::mostrarAlfabeticamente);
    }

}
