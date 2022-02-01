package com.github.eduumach.bootcamp.domain;

public abstract class Contents {

    protected static final double standard_XP = 10d;

    private String title;
    private String description;

    public abstract double calculate_xp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
