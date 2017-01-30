package com.epam.task3.catalog.service;

import com.epam.task3.catalog.beans.News;
import com.epam.task3.catalog.dao.DAOFactory;
import com.epam.task3.catalog.dao.NewsDAO;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class NewsServiceImpl implements NewsService {

    public void addNews(News news) throws ServiceException {
        // проверяем параметры??
        // функционал добавления книги
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
        //newsDAO.addNews();

    }


    public News findByTitle(News news) throws ServiceException {
        return news;
    }

    public News findByType(News news) throws ServiceException {
        return news;
    }
}
