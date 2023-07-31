package com.jsp.CloneAPIBookMyShow.exception;

import lombok.Getter;

@Getter
public class OwnerIdNotFoundException extends RuntimeException {
	private String message;

	public OwnerIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
