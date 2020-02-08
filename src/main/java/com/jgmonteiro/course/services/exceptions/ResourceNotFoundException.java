package com.jgmonteiro.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	//Passado o ID do objeto que tentou encontrar e não encontrou
	public ResourceNotFoundException(Object id) {
		super("Objeto não encontrado. ID "+ id);
	}
}
