package com.acesso.controle.core.exceptions;

public class BusinessException extends RuntimeException{
	
	private final Integer status;


	public BusinessException(String mensagem, Integer status) {
		super(mensagem);
		this.status = status;
    }
	
    public Integer getStatus() {
        return status;
    }
}
