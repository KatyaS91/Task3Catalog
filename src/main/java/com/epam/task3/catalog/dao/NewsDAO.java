package com.epam.task3.catalog.dao;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public interface NewsDAO {
    void addNews(News news) throws DAOException;

    News findByTitle(News news) throws DAOException;

    News findByType(News news) throws DAOException;
}
