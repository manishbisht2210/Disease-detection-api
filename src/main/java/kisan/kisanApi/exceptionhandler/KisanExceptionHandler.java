package kisan.kisanApi.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import kisan.kisanApi.exception.DiseaseNotFoundException;

@ControllerAdvice
public class KisanExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DiseaseNotFoundException.class)
	public ResponseEntity<Object> handleDiseaseNotFoundException(DiseaseNotFoundException exception){
		return  new ResponseEntity<Object>(exception, HttpStatus.NOT_FOUND);
	}
	
}