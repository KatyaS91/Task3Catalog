package com.epam.task3.catalog.service;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final NewsService newsService = new NewsServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public NewsService getNewsService(){
        return newsService;
    }
}
