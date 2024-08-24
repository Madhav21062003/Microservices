package com.userservice.exceptions;

import com.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse>  handlerResourceNotFoundException(ResourceNotFoundException ex){

        String message = ex.getMessage();
       ApiResponse response = new ApiResponse();
       response.setMessage(message);
       response.setSuccess(true);
       response.setStatus(HttpStatus.NOT_FOUND);




        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
