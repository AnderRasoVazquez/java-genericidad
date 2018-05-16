package ej5;

import java.time.LocalDate;
import java.util.Date;

public class Producto {
    private int cod;
    private String nombre;
    private float precio;
    private LocalDate fechaCaducidad;

    public Producto(int cod, String nombre, float precio, LocalDate fechaCaducidad) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public boolean estaCaducado() {
        return fechaCaducidad.isBefore(LocalDate.now());
    }
}
