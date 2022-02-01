package com.github.eduumach.bootcamp.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<Dev> subscribedDev = new HashSet<>();
    private Set<Contents> contents = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribedDev() {
        return subscribedDev;
    }

    public void setSubscribedDev(Set<Dev> subscribedDev) {
        this.subscribedDev = subscribedDev;
    }

    public Set<Contents> getContents() {
        return contents;
    }

    public void setContents(Set<Contents> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDev, bootcamp.subscribedDev) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, subscribedDev, contents);
    }
}
