package com.hotel.exceptions;

public class ResourceNotFooundException extends RuntimeException{

    public ResourceNotFooundException(String message){
        super(message);
    }

    public ResourceNotFooundException(){
        super("Resource Not Found");
    }
    
}
