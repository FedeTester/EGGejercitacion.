package anda;

import entidades.Perro;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro dog;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento, Perro dog) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.dog = dog;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", dog=" + dog + '}';
    }
    
    
    

}
