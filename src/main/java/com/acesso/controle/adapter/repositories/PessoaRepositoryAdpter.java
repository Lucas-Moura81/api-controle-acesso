package com.acesso.controle.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.acesso.controle.adapter.entities.PessoaEntity;
import com.acesso.controle.core.domain.Pessoa;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdpter {
	
	private final PessoaRepository pessoaRepository;
	private final ModelMapper modelMapper;
	
	public PessoaEntity createPessoa(Pessoa pessoa) {
		PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
		return pessoaRepository.save(pessoaEntity);
	}

}
