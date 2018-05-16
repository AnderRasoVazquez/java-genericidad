package ej1;

public class Main {
    public static void main(String[] args) {
        Estanteria estanteria = new Estanteria("bilbao", "olabeaga");
        estanteria.addLibro(new Libro("uno", "a1", 5));
        estanteria.addLibro(new Libro("dos", "a2", 7));
        estanteria.addLibro(new Libro("tres", "a3", 9));
        System.out.println("mostrar los mas caros");
        estanteria.mostrarMasCaros(6);

        System.out.println("mostrar alfabeticamente");

        Biblioteca b = new Biblioteca("la biblio");
        b.addEstanteria(estanteria);
        b.addEstanteria(estanteria);
        b.addEstanteria(estanteria);
        b.mostrarLibrosEstanterias();
    }
}
