package com.page.entity;

import java.io.Serializable;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:40 2020/2/23
 */
public class Movie implements Serializable {

    private static final long SerialVersionUID = 1L;

    private int id;
    private String directors;
    private String title;
    private String cover;
    private float rate;
    private String casts;

    public Movie() {
    }

    public Movie(int id, String directors, String title, String cover, float rate, String casts) {
        this.id = id;
        this.directors = directors;
        this.title = title;
        this.cover = cover;
        this.rate = rate;
        this.casts = casts;
    }

    public static long getSerialVersionUID() {
        return SerialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }
}
