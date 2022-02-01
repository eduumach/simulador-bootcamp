package com.github.eduumach.bootcamp.domain;

import java.time.LocalDate;

public class Mentoring extends Contents{
    private LocalDate date;

    @Override
    public double calculate_xp() {
        return standardXP + 20d;
    }

    public Mentoring() {
    }

    public Mentoring(String title, String description, LocalDate date) {
        setTitle(title);
        setDescription(description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
