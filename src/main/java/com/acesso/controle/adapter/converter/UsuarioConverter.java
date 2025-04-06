package com.acesso.controle.adapter.converter;

import org.springframework.stereotype.Component;

import com.acesso.controle.adapter.dto.UsuarioDto;
import com.acesso.controle.core.domain.Pessoa;
import com.acesso.controle.core.domain.Usuario;

@Component
public class UsuarioConverter {
	
    public Usuario toTomain(UsuarioDto usuarioDto) {
        return new Usuario(usuarioDto.getId(),
                usuarioDto.getEmail(),
                usuarioDto.getSenha(),
                usuarioDto.getAdministrador(),
                new Pessoa(null, usuarioDto.getNome())
        );
    }

    public UsuarioDto toDto (Usuario usuario) {
        return new UsuarioDto(usuario.getId(), 
        		usuario.getPessoa().getNome(), usuario.getEmail(), 
        		usuario.getSenha(), usuario.getAdministrador());
    }

}
