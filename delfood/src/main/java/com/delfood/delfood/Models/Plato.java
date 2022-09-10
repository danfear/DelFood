package com.delfood.delfood.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Platos")
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String name;
    @Column
    private Double precio;
    @Column
    private String descripcion;

    public Long getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

    public Double getPrecio(){
        return precio;
    }

    public String getDescription(){
        return descripcion;
    }

    public void setName(String name){
        this.name=name;
    }

    public void SetPrecio(double precio){
        this.precio=precio;
    }

    public void setdescription(String description){
        this.descripcion=description;
    }

    public Plato(String name,double precio, String description){
        this.name=name;
        this.precio=precio;
        this.descripcion=description;
    }
}