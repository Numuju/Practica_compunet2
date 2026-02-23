package com.example.model;

import java.util.ArrayList;
import java.util.List;
public class Item {
    private String name;
    private String property;
    private List<Avatar> users;
    
    public List<Avatar> getUsers() {
        if(users==null){
            users=new ArrayList<>();
        }
        return users;
    }
    public void setUsers(List<Avatar> users) {
        this.users = users;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProperty() {
        return property;
    }
    public void setProperty(String property) {
        this.property = property;
    }

}