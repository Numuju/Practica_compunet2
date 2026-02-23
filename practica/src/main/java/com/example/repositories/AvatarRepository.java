package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Avatar;

import jakarta.annotation.PostConstruct;
@Component
public class AvatarRepository {
    private List<Avatar> avatars=new ArrayList<>();
    
    @PostConstruct
    public void init(){
        Avatar avatar=new Avatar("Samuel","Numuju","samuel@gmail.com",null);
        save(avatar);
    }
    public void save(Avatar avatar){
         avatars.add(avatar);
    }

    public Avatar findByName(String name){
        return avatars.stream().filter(u ->u.getName()==name).findFirst().get();
    }

    public List<Avatar> findAll(){
        return avatars;
    }
}
