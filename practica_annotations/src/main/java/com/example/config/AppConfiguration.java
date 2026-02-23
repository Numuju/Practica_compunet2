package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.repositories.ItemRepository;
import com.example.services.AvatarService;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfiguration {
}
