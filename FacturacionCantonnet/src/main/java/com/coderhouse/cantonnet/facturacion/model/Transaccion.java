package com.coderhouse.cantonnet.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaccion")
public class Transaccion {

    @Column
    @Id
    private int transaccionid;
    @Column
    private Date fecha;
    @Column
    private int monto;
    @Column
    private int clienteid;

    //Constructores

    public Transaccion() {
    }

    public Transaccion(int transaccionid, Date fecha, int monto, int clienteid) {
        this.transaccionid = transaccionid;
        this.fecha = fecha;
        this.monto = monto;
        this.clienteid = clienteid;
    }
    //Getter and Setter

    public int getTransaccionid() {
        return transaccionid;
    }

    public void setTransaccionid(int transaccionid) {
        this.transaccionid = transaccionid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }
}
