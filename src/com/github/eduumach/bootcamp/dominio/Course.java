package com.github.eduumach.bootcamp.dominio;

public class Course {
    private String title;
    private String description;
    private int work_load;

    public Course() {
    }

    public Course(String title, String description, int work_load) {
        this.title = title;
        this.description = description;
        this.work_load = work_load;
    }

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

    public int getWork_load() {
        return work_load;
    }

    public void setWork_load(int work_load) {
        this.work_load = work_load;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", work_load=" + work_load +
                '}';
    }
}
