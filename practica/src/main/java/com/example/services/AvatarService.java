package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Avatar;
import com.example.model.Item;
import com.example.repositories.AvatarRepository;
import com.example.repositories.ItemRepository;
@Component
public class AvatarService {
    @Autowired
    private AvatarRepository avatarRepository;
    @Autowired
    private ItemRepository itemRepository;

    public void setAvatarRepository(AvatarRepository avatarRepository) {
        this.avatarRepository = avatarRepository;
    }
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addAvatar(String name,String username,String email){
        Avatar avatar=new Avatar();
        avatar.setName(name);
        avatar.setUsername(username);
        avatar.setEmail(email);
        avatarRepository.save(avatar);
    }

    public void AddItemToAvatar(String nameItem,String nameAvatar){
        Avatar avatar=avatarRepository.findByName(nameAvatar);
        Item item=itemRepository.findyByName(nameItem);

        avatar.getItems().add(item);
        item.getUsers().add(avatar);
    }

    public List<Avatar> getAvatars(){
        return avatarRepository.findAll();
    }

    
}
