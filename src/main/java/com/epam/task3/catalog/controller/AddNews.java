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

    News news;
    public void setNews(News news) {        this.news = news;    }

    public AddNews(String response, News news) {
        this.news = news;
        this.response = response;
    }

    public AddNews(){
        this.response = response;
        this.news = news;
    }

    public String execute(String request){
        // взять параметры из запроса и инициализировать объект, созд объект?
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        NewsService newsService = serviceFactory.getNewsService();
        try {
            newsService.addNews();
            response = "Новость добавлена";
        } catch (ServiceException e){
            response = "Ошибка добавления новости";
        }
        return response;
    }
}
