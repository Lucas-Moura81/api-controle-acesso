package com.acesso.controle.core.services;

import com.acesso.controle.core.domain.Usuario;
import com.acesso.controle.core.exceptions.BusinessException;
import com.acesso.controle.core.rest.UsuarioRepositoryPort;
import com.acesso.controle.core.rest.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort{
	
	private final UsuarioRepositoryPort usuarioRepositoryPort;

	public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
		this.usuarioRepositoryPort = usuarioRepositoryPort;
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		Usuario usuarioExistente =  usuarioRepositoryPort.obtemPorEmail(usuario.getEmail());
		if(usuarioExistente != null) {
			throw new BusinessException("Usuário já cadastrado", 400);
		}
		return usuarioRepositoryPort.create(usuario);
	}

}
