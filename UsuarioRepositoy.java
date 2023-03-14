package com.tienda.emiliano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.emiliano.model.Usuario;

public interface UsuarioRepositoy extends JpaRepository <Usuario,Integer> {
	
}

