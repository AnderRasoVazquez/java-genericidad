package ej4;

public class Main {

    public static void main(String[] args) {
        Censo censo = Censo.getInstance();

        censo.add(new Persona("1", "a", "aa", 22, EnumEstadoCivil.SOLTERO, EnumSector.INGENIERIA));
        censo.add(new Persona("2", "b", "bb", 23, EnumEstadoCivil.SOLTERO, EnumSector.SANIDAD));
        censo.add(new Persona("3", "c", "cc", 24, EnumEstadoCivil.SOLTERO, EnumSector.SERVICIOS));

        System.out.println(censo.mediaEdadPoblacion());
        System.out.println(censo.porcentajeIngenieros());

    }
}
