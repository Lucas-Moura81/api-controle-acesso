package com.acesso.controle.core.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErroResponse> handleBusinessException(BusinessException ex, HttpServletRequest request) {
		ErroResponse erroResponse = new ErroResponse(ex.getMessage(), ex.getStatus(), request.getRequestURI());
		return ResponseEntity.status(ex.getStatus()).body(erroResponse);
	}
}
