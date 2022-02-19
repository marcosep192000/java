package com.cursodeprueba.java.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto_entity")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String  nombre;
    private String descripcion;
    private Float precioUnitario;
    private Integer codigoInventario;
    private  String categoria;



   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(Integer codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}