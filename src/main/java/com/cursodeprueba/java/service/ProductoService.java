package com.cursodeprueba.java.service;

import com.cursodeprueba.java.entity.ProductoEntity;
import com.cursodeprueba.java.entity.UsuarioEntity;
import com.cursodeprueba.java.repository.ProductoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class ProductoService {

    @Autowired
    ProductoEntityRepository productoEntityRepository;

    public ArrayList<ProductoEntity> ListarProducto(){
        return (ArrayList<ProductoEntity>) productoEntityRepository.findAll();
    }
    public ProductoEntity nuevoProducto(ProductoEntity producto){
        return productoEntityRepository.save(producto);
    }

    public boolean  eliminarProducto(Long id){
    try {
         productoEntityRepository.deleteById(id);
         return  true;
    }
    catch(Exception ERR)
    {
        return false;
        }
    }


    public  ArrayList<ProductoEntity> FiltrarCategoria(String categoria){
        return productoEntityRepository.findByCategoria(categoria);
    }

}
