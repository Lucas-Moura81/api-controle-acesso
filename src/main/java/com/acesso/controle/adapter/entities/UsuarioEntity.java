package com.acesso.controle.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private String email;
	private String senha;
	private Boolean administrador;
}
