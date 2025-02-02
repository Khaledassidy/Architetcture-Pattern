package com.example.architecturepattern.MVC.Model;

public class Model {
    String name;
    String date;
    String description;
    int id;

    public Model(String name, String date, String description, int id) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.id = id;
    }

    public Model(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
