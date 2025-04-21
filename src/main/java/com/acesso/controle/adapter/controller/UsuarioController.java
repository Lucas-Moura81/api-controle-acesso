package com.acesso.controle.adapter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acesso.controle.adapter.converter.UsuarioConverter;
import com.acesso.controle.adapter.dto.UsuarioDto;
import com.acesso.controle.core.domain.Usuario;
import com.acesso.controle.core.rest.UsuarioServicePort;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("usuario")
public class UsuarioController {
	
	private final UsuarioServicePort usuarioServicePort;
	private final UsuarioConverter usuarioConverter;
	
	@Operation(summary = "Criar usuário", description = "Retorna um Objeto usuário criado")
	@PostMapping
  	public ResponseEntity<UsuarioDto> created(@RequestBody @Valid UsuarioDto usuarioDto)  {
		Usuario usuario = usuarioConverter.toTomain(usuarioDto);
		usuarioServicePort.createUsuario(usuario);
		usuarioDto = usuarioConverter.toDto(usuario);
		return  ResponseEntity.status(HttpStatus.CREATED).body(usuarioDto);
	
	}

}
