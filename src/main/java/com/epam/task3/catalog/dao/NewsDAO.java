package com.epam.task3.catalog.dao;

import com.epam.task3.catalog.beans.News;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public interface NewsDAO {
    void addNews(News news) throws DAOException;
    void findByDate(News news) throws DAOException;
    void findByTitle(News news) throws DAOException;
    void findByType(News news) throws DAOException;
}
