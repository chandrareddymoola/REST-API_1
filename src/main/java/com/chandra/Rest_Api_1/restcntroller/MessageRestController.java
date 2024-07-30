package com.chandra.Rest_Api_1.restcntroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcome(){
//localhost:8080/welcome
        return new ResponseEntity<>("Welcome to Rest Controller", HttpStatus.OK);
    }
    @GetMapping("/greet")
    public ResponseEntity<String> getGreet(){
        return new ResponseEntity<>("Welcome Rest API",HttpStatus.OK);
    }
}
