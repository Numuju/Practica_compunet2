package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.repositories.RoleRepository;
import com.example.services.RoleService;;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfiguration {
    @Autowired
    private RoleRepository repository;
    @Bean
    public RoleRepository createRoleRepository(){
        return new RoleRepository();
    }
    @Bean
    public RoleService service(){
        RoleService service=new RoleService();
        service.setRoleRepository(repository);
        return service;
    }
}
