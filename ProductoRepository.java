package com.tienda.emiliano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.emiliano.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
