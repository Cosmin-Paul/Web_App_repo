package com.itschool.project.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class UserCreateException extends RuntimeException{

    public UserCreateException(String message) {
        super(message);

    }

}
