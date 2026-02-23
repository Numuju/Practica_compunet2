package com.example.model;

import java.util.List;

public class Avatar {
    private String name;
    private String username;
    private String email;
    private List<Item> items;
    public Avatar(){}

    public Avatar(String name, String username, String email, List<Item> items) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.items = items;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
