package com.example.services;

import com.example.model.User;
import com.example.repositories.UserRepository;

public class DatabaseLoader implements LoadUserService {
    private UserRepository repository;

    @Override
    public boolean isUserValid(String username, String password) {
        User u= repository.findById(0);
        if (u!=null) {
            return u.getPassword().equals(password);
        }
        return false;
    }

}
