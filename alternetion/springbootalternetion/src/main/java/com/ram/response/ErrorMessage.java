package com.ram.response;

import java.util.Date;
import java.util.List;

//import java.util.Date;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import com.ram.exception.ErrorMessage;
//import com.ram.exception.LobNotfoundException;
//
//@ControllerAdvice
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
//	@ExceptionHandler(LobNotfoundException.class)
//	public ResponseEntity<?> resourceNotFoundException(LobNotfoundException ex, WebRequest request) {
//		ErrorMessage message = new ErrorMessage(
//		        HttpStatus.NOT_FOUND.value(),
//		        new Date(),
//		        ex.getMessage(),
//		        request.getDescription(false));
//		    
//		    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
//		  }
//	
//
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
//		ErrorMessage message = new ErrorMessage(
//		        HttpStatus.METHOD_NOT_ALLOWED.value(),
//		        new Date(),
//		        ex.getMessage(),
//		        request.getDescription(false));
//		    
//		    return new ResponseEntity<ErrorMessage>(message, HttpStatus.METHOD_NOT_ALLOWED);
//	}
//	
//	@Override
//	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//	      HttpHeaders headers, HttpStatus status, WebRequest request) {
//	    ErrorDetails errorDetails = new ErrorDetails(new Date(), "Validation Failed",
//	        ex.getBindingResult().toString());
//	    return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
//	  } 
//}


public class ErrorMessage {
	  private int statusCode;
	  private Date timestamp;
	  private List<String> errorlist;
	  private String message;
	  private String description;

	  public ErrorMessage(int statusCode, Date timestamp,List<String> errorlist,String message, String description) {
	    this.statusCode = statusCode;
	    this.timestamp = timestamp;
	    this.errorlist = errorlist;
	    this.message = message;
	    this.description = description;
	  }

	  public int getStatusCode() {
	    return statusCode;
	  }

	  public Date getTimestamp() {
	    return timestamp;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public String getDescription() {
	    return description;
	  }

	public List<String> getErrorlist() {
		return errorlist;
	}

	
	}

