package com.example.Facetify.controller;

import com.example.Facetify.entity.Users;
import com.example.Facetify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<Users> list(){
        return userService.list();
    }

    @PostMapping("/user")
    @ResponseBody
    public Users create(@RequestBody Users users){
        return userService.save(users);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public Users search(@PathVariable Long id){
        return userService.search(id);
    }
}
