package com.coderhouse.cantonnet.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Column(name ="IDCLIENTE")
    @Id
    private int IDcliente;
    @Column(name ="DNI")
    private int dni;
    @Column(name  = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "fechanacimiento")
    private Date fechanacimiento;

    //Constructor

    public Cliente(int IDcliente, int dni, String nombre, String apellido, Date fechanacimiento) {
        this.IDcliente = IDcliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }


    //ConstructorNone

    public Cliente() {
    }

    //Getters and Setters

    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}
