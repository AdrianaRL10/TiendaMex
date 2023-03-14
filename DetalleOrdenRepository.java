package com.tienda.emiliano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.emiliano.model.DetalleOrden;

public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
