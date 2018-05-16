package ej2;

public class Main {

    public static void main(String[] args) {
        ListaPersonas l = new ListaPersonas();
        l.add(new Persona("a", 22));
        l.add(new Persona("a", 23));
        l.add(new Persona("a", 24));
        System.out.println(l.obtenerEdadMedia());
        l.mostrarDatosDeMayoresQueMedia();
    }
}
