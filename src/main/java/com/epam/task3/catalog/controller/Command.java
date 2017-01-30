package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public interface Command {
    public String execute(String request);

}
