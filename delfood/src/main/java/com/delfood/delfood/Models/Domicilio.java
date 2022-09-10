package com.delfood.delfood.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name="Domicilios")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;

    @Column
    public String direccion;

    @Column
    public int tiempo;

    @Column
    public double precio;

    @Column
    public int cantidad;

    @ManyToOne
    public Plato plato;

    public Domicilio(String Direccion,int tiempo,double precio,int cantidad){
        this.direccion=Direccion;
        this.tiempo=tiempo;
        this.precio=precio;
        this.cantidad=cantidad;
    }
}
