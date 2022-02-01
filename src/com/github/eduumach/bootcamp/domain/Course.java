package com.github.eduumach.bootcamp.domain;

public class Course extends Contents{
    private int work_load;

    @Override
    public double calculate_xp() {
        return standard_XP * work_load;
    }

    public Course() {
    }

    public Course(String title, String description, int work_load) {
        setTitle(title);
        setDescription(description);
        this.work_load = work_load;
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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", work_load=" + work_load +
                '}';
    }
}
