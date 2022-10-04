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
    @Column
    private String image;
    @Column
    private int tiempo;

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
    public String getImage(){
        return image;
    }
    public int getTiempo(){
        return tiempo;
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
    public void setimage(String image){
        this.image=image;
    }
    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }

    public Plato(){
        
    }
    public Plato(String name,double precio, String description,String Image, int tiempo){
        this.name=name;
        this.precio=precio;
        this.descripcion=description;
        this.image=Image;
        this.tiempo=tiempo;
    }
}
