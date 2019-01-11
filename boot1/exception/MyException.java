package com.lls.erpweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable throwable) {
		super(throwable);
	}

	public MyException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
