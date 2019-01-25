package com.springboot.main.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomUniversalExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionDetailBean> resourceNotFoundException(ResourceNotFoundException rnf, WebRequest wr) {
		ExceptionDetailBean edb = new ExceptionDetailBean(new Date(), rnf.getMessage(), wr.getDescription(false));
		return new ResponseEntity<>(edb,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalHandler(Exception ex, WebRequest wr) {
		ExceptionDetailBean edb = new ExceptionDetailBean(new Date(), ex.getMessage(), wr.getDescription(false) );
		return new ResponseEntity<>(edb, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
