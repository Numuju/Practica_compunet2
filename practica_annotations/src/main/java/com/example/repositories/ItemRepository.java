package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Item;
@Component
public class ItemRepository {

     private List<Item> items=new ArrayList<>();

     public void save(Item item){
        items.add(item);
     }
     public Item findyByName(String name){
        return items.stream().filter(u -> u.getName() == name).findFirst().get();
     }
}