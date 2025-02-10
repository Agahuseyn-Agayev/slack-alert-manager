package com.example.slackalertmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoring")
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/error")
    public String generateError() {
        throw new ErrorResponseException(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
