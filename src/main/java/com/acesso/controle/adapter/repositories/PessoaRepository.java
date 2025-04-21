package com.acesso.controle.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acesso.controle.adapter.entities.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long>{

}
