package ej1;

public class Libro {
    private String titulo;
    private String autor;
    private int precio;

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }
}
