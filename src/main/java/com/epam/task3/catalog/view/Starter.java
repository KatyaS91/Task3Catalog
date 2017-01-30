package com.epam.task3.catalog.view;

import com.epam.task3.catalog.beans.News;
import com.epam.task3.catalog.controller.Controller;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class Starter {

    public static void main(String[] args){

        News newsTest = new News();
        newsTest.setType("Movie");
        newsTest.setTitle("A Clockwork Orange");
        newsTest.setDescription("«Заводно́й апельси́н» (англ. A Clockwork Orange) — роман Энтони Бёрджесса, написанный в 1962 году, лёг в основу одноимённого фильма");

        Controller controller = new Controller();
        controller.executeTask("add news", newsTest);
    }
}
