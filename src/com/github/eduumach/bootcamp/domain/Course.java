package com.github.eduumach.bootcamp.domain;

public class Course extends Contents{
    private int workLoad;

    @Override
    public double calculate_xp() {
        return standardXP * workLoad;
    }

    public Course() {
    }

    public Course(String title, String description, int workLoad) {
        setTitle(title);
        setDescription(description);
        this.workLoad = workLoad;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
