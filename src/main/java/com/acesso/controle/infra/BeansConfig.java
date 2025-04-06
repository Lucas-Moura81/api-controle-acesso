package com.acesso.controle.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acesso.controle.core.rest.UsuarioRepositoryPort;
import com.acesso.controle.core.rest.UsuarioServicePort;
import com.acesso.controle.core.services.UsuarioService;

@Configuration
public class BeansConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
    
	@Bean
	public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
		return new UsuarioService(usuarioRepositoryPort);
	}
	
	 
}
