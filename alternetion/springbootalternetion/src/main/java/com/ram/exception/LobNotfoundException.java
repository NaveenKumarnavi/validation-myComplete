package com.ram.exception;

public class LobNotfoundException extends RuntimeException {

	  private static final long serialVersionUID = 1L;

	  public LobNotfoundException(String msg) {
	    super(msg);
	  }
	}