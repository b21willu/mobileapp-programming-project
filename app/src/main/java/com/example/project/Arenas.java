package com.example.project;

public class Arenas {
    private final String id;
    private final String name;
    private final String company;
    private final String location;
    private final int size;

    public Arenas(String id, String name, String company, String location, int size  ) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.location = location;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }

}
