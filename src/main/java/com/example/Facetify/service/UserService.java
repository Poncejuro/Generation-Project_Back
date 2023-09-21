package com.example.Facetify.service;

import com.example.Facetify.entity.Users;
import com.example.Facetify.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public Users save(Users user){
        return userRepo.save(user);
    }

    public void delete(Long id){
        userRepo.deleteById(id);
    }

    public List<Users> list(){
        return userRepo.findAll();
    }

    public Users search(Long id){
        return userRepo.findById(id).orElse(null);
    }
}
