package com.coderhouse.cantonnet.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Column
    @Id
    private int IDproducto;
    @Column
    private int Codigo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private int cantidad;
    @Column
    private float precio;

    //Constructores


    public Producto() {
    }

    public Producto(int IDproducto, int codigo, String nombre, String descripcion, int cantidad, float precio) {
        this.IDproducto = IDproducto;
        this.Codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getter and Setter


    public int getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
