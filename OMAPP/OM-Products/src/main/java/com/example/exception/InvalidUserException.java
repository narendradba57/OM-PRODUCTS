package com.example.exception;

public class InvalidUserException extends RuntimeException{
	private String message;
	public InvalidUserException() {
	
	}
	public InvalidUserException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "InvalidUserException [message=" + message + "]";
	}
	
}
