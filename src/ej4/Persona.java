package ej4;

public class Persona {
//    DNI, nombre, apellidos, edad, estado civil y profesión

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private EnumEstadoCivil estadoCivil;
    private EnumSector profesion;

    public Persona(String dni, String nombre, String apellidos, int edad, EnumEstadoCivil estadoCivil, EnumSector profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public EnumSector getProfesion() {
        return profesion;
    }
}
