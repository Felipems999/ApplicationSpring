package com.felipe.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.application.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
