package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Role;
import com.example.model.User;
import com.example.repositories.RoleRepository;
import com.example.repositories.UserRepository;

@Component
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
}
