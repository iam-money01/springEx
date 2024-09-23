package com.example.demo.err.validate.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpExceptionHandler {
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgumentEx(MethodArgumentNotValidException ex){
		Map<String, String> errMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(err -> {
			errMap.put(err.getField(), err.getDefaultMessage());
		});
		return errMap;
	}

}
