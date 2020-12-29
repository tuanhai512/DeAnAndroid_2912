package com.example.doanltdd.model;

public class ExerciseMedium {
    private int resourceID;

    public ExerciseMedium(int resourceID, String name) {
        this.resourceID = resourceID;
        this.name = name;
    }

    private String name;
    public ExerciseMedium(int resourceID) {
        this.resourceID = resourceID;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
