package com.epam.task3.catalog.dao;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final NewsDAO sqlNewsImpl = new SQLNewsDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public NewsDAO getNewsDAO(){
        return sqlNewsImpl;
    }
}
