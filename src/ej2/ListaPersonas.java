package ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ListaPersonas {

    private Collection<Persona> personas;

    public ListaPersonas() {
        personas = new ArrayList<>();
    }

    public double obtenerEdadMedia() {
        return personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .getAsDouble();
    }

    public void add(Persona p) {
        personas.add(p);
    }

    public void mostrarDatosDeMayoresQueMedia() {
        double media = this.obtenerEdadMedia();
        int a = 7;
        personas.stream()
                    .filter(p -> p.getEdad() > media)
                    .forEach(p -> System.out.println(p.getNombre() + ": " + p.getEdad()));
    }
}
