package com.Arthur.Projetospring.resources.Exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Arthur.Projetospring.Services.Exceptions.DataBaseException;
import com.Arthur.Projetospring.Services.Exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public  ResponseEntity<StandardError> resoucerNotFound(ResourceNotFoundException e , HttpServletRequest request)
	{
			String error= "Resourcer not found";
			HttpStatus status = HttpStatus.NOT_FOUND;
			StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}
	@ExceptionHandler(DataBaseException.class)
	public  ResponseEntity<StandardError> database(DataBaseException e , HttpServletRequest request)
	{
			String error= "Data Base error";
			HttpStatus status = HttpStatus.BAD_REQUEST;
			StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}
}
