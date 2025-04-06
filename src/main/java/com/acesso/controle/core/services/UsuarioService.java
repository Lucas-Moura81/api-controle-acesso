package com.acesso.controle.core.services;

import com.acesso.controle.core.domain.Usuario;
import com.acesso.controle.core.rest.UsuarioRepositoryPort;
import com.acesso.controle.core.rest.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort{
	
	private final UsuarioRepositoryPort usuarioRepositoryPort;

	public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
		this.usuarioRepositoryPort = usuarioRepositoryPort;
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		return usuarioRepositoryPort.create(usuario);
	}

}
