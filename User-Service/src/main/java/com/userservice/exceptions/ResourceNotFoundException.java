package com.userservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(){
        super("Resource No Found on Server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
