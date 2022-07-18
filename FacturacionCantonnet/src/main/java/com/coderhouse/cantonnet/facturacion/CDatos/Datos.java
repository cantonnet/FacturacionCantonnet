package com.coderhouse.cantonnet.facturacion.CDatos;

public class Datos {

    private int IDcliente;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTORRES

    public Datos(int IDcliente, int dni, String nombre, String apellido, int edad) {
        this.IDcliente = IDcliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Datos() {
    }
// GETTERS SETTERS

    public int getIDcliente() {return IDcliente;}
    public void setIDcliente(int IDcliente) {this.IDcliente = IDcliente;}
    public int getDni() {return dni;}
    public void setDni(int dni) {this.dni = dni;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
}
