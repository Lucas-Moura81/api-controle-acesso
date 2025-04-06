package com.acesso.controle.adapter.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Objeto de requisição para criar usuário")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDto {
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private Boolean administrador;
}
