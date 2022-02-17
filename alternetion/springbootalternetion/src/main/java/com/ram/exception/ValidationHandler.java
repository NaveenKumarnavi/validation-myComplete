package com.ram.exception;

import java.util.Date;
import java.util.List;

public class ValidationHandler {

	private Date timestamp;
	
	private List<String> errorlist;
	
	private String error;

	public ValidationHandler(Date timestamp, List<String> errorlist,String error) {
		super();
		this.timestamp = timestamp;
		this.errorlist = errorlist;
		this.error = error;

	}
	public Date getTimestamp() {
		return timestamp;
	}
	public List<String> getErrorlist() {
		return errorlist;
	}
	public String getError() {
		return error;
	}
}
