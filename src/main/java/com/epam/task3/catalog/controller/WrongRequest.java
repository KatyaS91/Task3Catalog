package com.epam.task3.catalog.controller;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class WrongRequest implements Command{

    public String execute(String request){
        return "Неправильный запрос";
    }

}
