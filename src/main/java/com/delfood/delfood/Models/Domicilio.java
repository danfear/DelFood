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
    public int precio;

    @Column
    public int cantidad;

    @Column
    public String nombre;

    @Column
    public String Telefono;

    @ManyToOne
    public Plato plato;

    public Long getId(){
        return Id;
    }
    public int getTiempo(){
        return tiempo;
    }
    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public Plato getPlato(){
        return plato;
    }
    public void setPlato(Plato plato){
        this.plato=plato;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return Telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String Telefono){
        this.Telefono=Telefono;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public Domicilio(){

    }
    public Domicilio(String Direccion,int tiempo,int precio,int cantidad,Plato plato){
        this.direccion=Direccion;
        this.tiempo=tiempo;
        this.precio=precio;
        this.cantidad=cantidad;
        this.plato=plato;
    }
}