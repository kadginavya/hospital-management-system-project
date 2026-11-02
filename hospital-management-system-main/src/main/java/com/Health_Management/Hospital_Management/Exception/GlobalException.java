package com.Health_Management.Hospital_Management.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class GlobalException {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorResponse> HandleNotFound(ResourceNotFound ex){
        ErrorResponse or =new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(or,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> HandleValidation(MethodArgumentNotValidException ex){
        String message=ex.getBindingResult().getFieldError().getDefaultMessage();
        ErrorResponse er=new ErrorResponse(HttpStatus.BAD_REQUEST.value(),ex.getBindingResult().getFieldError().getDefaultMessage(),LocalDateTime.now());
        return new ResponseEntity<>(er,HttpStatus.BAD_REQUEST);
    }
}
