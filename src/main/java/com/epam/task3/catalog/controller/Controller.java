package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private final char paramDelimeter = ' ';

    public String executeTask(String request, News news){
        String commandName;
        Command executionCommand;

        commandName = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandName);
        provider.setNews(news);

        String response;
        response = executionCommand.execute(request);

        return response;
    }

}
