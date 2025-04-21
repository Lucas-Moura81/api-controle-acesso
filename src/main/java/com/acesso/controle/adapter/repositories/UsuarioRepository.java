package com.acesso.controle.adapter.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acesso.controle.adapter.entities.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	UsuarioEntity findByEmail(String email); 

}
