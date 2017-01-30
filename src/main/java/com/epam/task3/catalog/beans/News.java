package com.epam.task3.catalog.beans;

import java.util.Date;

/**
 * Created by skarzhynskaya_katya on 1/30/17.
 */
public class News {
    String title;
    String type;
    String description;
    //Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

/*    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }*/
}
