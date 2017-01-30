package com.epam.task3.catalog.service;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public interface NewsService {

    void addNews(News news) throws ServiceException;

    News findByTitle(News news) throws ServiceException;

    News findByType(News news) throws ServiceException;
}
