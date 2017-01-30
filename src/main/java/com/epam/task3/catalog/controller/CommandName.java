package com.epam.task3.catalog.controller;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public enum  CommandName {

    ADD_NEWS("Add news"),
    FIND_BY_TYPE("Find by type"),
    FIND_BY_TITLE("Find by title"),
    WRONG_REQUEST("Wrong request");

    CommandName(String name) {
        this.name = name;
    }

    private String name;

}
