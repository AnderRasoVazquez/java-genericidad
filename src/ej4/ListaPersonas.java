package ej4;

import java.util.ArrayList;
import java.util.Collection;

public class ListaPersonas {
    private Collection<Persona> lista;

    public ListaPersonas() {
        this.lista = new ArrayList<>();
    }

    public void add(Persona p) {
        lista.add(p);
    }

    public double mediaEdad() {
        return lista.stream()
                        .mapToInt(Persona::getEdad)
                        .average()
                        .getAsDouble();
    }

    // sector
    public double porcentajeSector(EnumSector sector) {
        int cuantos = lista.size();
        long cuantosDelSector = lista.stream()
                                            .filter(p -> p.getProfesion().equals(sector))
                                            .count();
        /*
        todos       100%
        cuantosProf   x

        cuantosProf * 100 / todos
         */

        return (cuantosDelSector * 100) / cuantos;
    }
}
