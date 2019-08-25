package kisan.kisanApi.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"cause", "stackTrace", "suppressed", "localizedMessage"})
public class DiseaseNotFoundException extends Exception{

	public DiseaseNotFoundException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
}
