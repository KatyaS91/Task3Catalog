package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap();

    News news;

    public void setNews(News news) {this.news = news;}


    CommandProvider(){
        repository.put(CommandName.ADD_NEWS, new AddNews());
        repository.put(CommandName.FIND_BY_TITLE, new FindByTitle());
        repository.put(CommandName.FIND_BY_TYPE, new FindByType());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());

    }
    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf((name.toUpperCase()));
            command = repository.get(commandName);
        } catch ( IllegalArgumentException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
