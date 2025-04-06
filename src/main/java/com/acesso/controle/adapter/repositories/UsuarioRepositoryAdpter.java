package com.acesso.controle.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.acesso.controle.adapter.entities.UsuarioEntity;
import com.acesso.controle.core.domain.Usuario;
import com.acesso.controle.core.rest.UsuarioRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdpter implements UsuarioRepositoryPort{
	
	private final UsuarioRepository usuarioRepository;
	private final ModelMapper modelMapper;

	@Override
	public Usuario create(Usuario usuario) {
		UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
		usuarioRepository.save(usuarioEntity);
		return modelMapper.map(usuarioEntity, Usuario.class);
	}
	
	

}
