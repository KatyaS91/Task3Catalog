package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class WrongRequest implements Command{

    public String execute(News news) {
        return "Неправильный запрос";
    }

}
