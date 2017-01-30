package com.epam.task3.catalog.controller;

import com.epam.task3.catalog.beans.News;
import com.epam.task3.catalog.service.NewsService;
import com.epam.task3.catalog.service.ServiceException;
import com.epam.task3.catalog.service.ServiceFactory;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class FindByType implements Command {
    public String execute(News news) {
        String response = null;
        // взять параметры из запроса и инициализировать объект
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        NewsService newsService = serviceFactory.getNewsService();
        try {
            News x = newsService.findByType(news);
            response = "Найденные новости: " + x.toString();
        } catch (ServiceException e){
            response = "Ошибка во время поиска по категории";
        }
        return response;
    }
}
