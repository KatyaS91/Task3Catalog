package com.epam.task3.catalog.service;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class ServiceException extends Exception {
    private static final long serialVersionUID = 1L;

    public ServiceException(){
        super();
    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(Exception e){
        super(e);
    }

    public ServiceException(String message, Exception e){
        super(message, e);
    }
}
