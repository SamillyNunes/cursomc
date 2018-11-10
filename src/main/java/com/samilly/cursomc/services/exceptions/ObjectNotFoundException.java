package com.samilly.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) { //construtor que reaproveita a mensagem da classe pai 
		super(msg); 
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) { //agora com uma possivel causa que aconteceu antes (?)
		super(msg,cause);
	}

}
