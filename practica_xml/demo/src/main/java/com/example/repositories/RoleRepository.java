package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Role;

public class RoleRepository {

    private List<Role> roles = new ArrayList<>();

    private long currentId;

    public void save(Role role){
        currentId++;
        role.setId(currentId);
        roles.add(role);    
    }

    public Role findById(long id){
        return roles.stream().filter(u -> u.getId() == id).findFirst().get();
    }
    
}