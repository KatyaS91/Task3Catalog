package com.epam.task3.catalog.dao;

import com.epam.task3.catalog.beans.News;

import java.io.File;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class SQLNewsDAO implements NewsDAO {
    File file = new File("/Users/skarzhynskaya_katya/Documents");

    public void addNews(News news) throws DAOException {
        if (file.exists()) {

        } else {
            return;
        }

    public News findByTitle(News news) throws DAOException {

        return news;
    }

    public News findByType(News news) throws DAOException {
        return news;
    }
}
