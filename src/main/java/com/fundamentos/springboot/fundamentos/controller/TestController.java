package com.fundamentos.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public ResponseEntity<String> function() {
        return new ResponseEntity<>("Hello, this is working fine ¡yeah!", HttpStatus.OK);
    }
}
