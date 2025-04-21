package com.acesso.controle.core.rest;

import com.acesso.controle.core.domain.Usuario;

public interface UsuarioRepositoryPort {
	
	public Usuario create(Usuario usuario);
    
	public Usuario obtemPorEmail(String email); 
}
