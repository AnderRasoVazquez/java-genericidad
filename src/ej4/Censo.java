package ej4;

public class Censo {
    private static Censo instance;
    private ListaPersonas listaPersonas;
    
    private Censo() {
        listaPersonas = new ListaPersonas();
    }

    public static Censo getInstance() {
        if (instance == null) {
            instance = new Censo();
        }
        return instance;
    }

    public void add(Persona p){
        listaPersonas.add(p);
    }

    public double mediaEdadPoblacion() {
        return listaPersonas.mediaEdad();
    }

    public double porcentajeIngenieros() {
        return listaPersonas.porcentajeSector(EnumSector.INGENIERIA);
    }

}

