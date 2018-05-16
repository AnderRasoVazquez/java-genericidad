package ej3;

public class Libro {
    private String titulo;
    private String autor;
    private int hojas;

    public Libro(String titulo, String autor, int hojas) {
        this.titulo = titulo;
        this.autor = autor;
        this.hojas = hojas;
    }

    public int getHojas() {
        return hojas;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + ": " + hojas;
    }
}
