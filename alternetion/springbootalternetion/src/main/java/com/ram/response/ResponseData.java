package com.ram.response;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseData {
    public static ResponseEntity<Object> handleUserNotFoundException;

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus timestamp, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("timestamp", new Date());
       map.put("data", responseObj);
      

        return new ResponseEntity<Object>(map,timestamp);
    }
}
