package com.cursodeprueba.java.repository;

import com.cursodeprueba.java.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductoEntityRepository extends JpaRepository<ProductoEntity, Long> {
public  abstract ArrayList<ProductoEntity> findByCategoria(String categoria);
}