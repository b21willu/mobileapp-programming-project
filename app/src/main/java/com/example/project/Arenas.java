package com.example.project;

public class Arenas {
    private final int id;
    private final String name;
    private final String login;
    private final String company;
    private final String location;
    private final int size;

    public Arenas(int id, String name, String login, String company, String location, int size  ) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.company = company;
        this.location = location;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
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
