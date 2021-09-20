package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class InvalidAuthorizationException extends RuntimeException{
private String message;
public InvalidAuthorizationException() {
	this.message="";
}
public InvalidAuthorizationException(String message) {
	this.message=message;
}
@Override
public String toString() {
	return "InvalidStockIdException [message=" + message + "]";
}
}
