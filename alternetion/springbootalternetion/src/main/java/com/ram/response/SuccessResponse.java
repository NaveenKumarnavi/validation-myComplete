package com.ram.response;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SuccessResponse {
    public static ResponseEntity<Object> handleUserNotFoundException;

    public static ResponseEntity<Object> success(String message, HttpStatus timestamp) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("timestamp",new Date());
      
      

        return new ResponseEntity<Object>(map,timestamp);
    }
}
