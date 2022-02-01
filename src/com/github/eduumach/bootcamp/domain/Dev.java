package com.github.eduumach.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Contents> subscribedContent = new LinkedHashSet<>();
    private Set<Contents> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDev().add(this);
    }

    public void progress(){
        Optional<Contents> contents = this.subscribedContent.stream().findFirst();
        if(contents.isPresent()){
            this.completedContents.add(contents.get());
            this.subscribedContent.remove(contents.get());
        }else {
            System.err.println("you are not registered in any content");
        }
    }

    public double calculateTotalXp(){
        return this.completedContents.stream().mapToDouble(Contents::calculate_xp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Contents> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Contents> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Contents> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContents);
    }
}
