package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;
import com.epam.task3.catalog.service.NewsService;
import com.epam.task3.catalog.service.ServiceException;
import com.epam.task3.catalog.service.ServiceFactory;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class AddNews implements Command {

    String response = null;

    public String execute(News news) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        NewsService newsService = serviceFactory.getNewsService();
        try {
            newsService.addNews(news);
            response = "Новость добавлена";
        } catch (ServiceException e){
            response = "Ошибка добавления новости";
        }
        return response;
    }
}
