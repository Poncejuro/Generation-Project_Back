package com.Facetify.controller;

import com.Facetify.entity.User;
import com.Facetify.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<User> list(){
        return userService.list();
    }

    @PostMapping("/user")
    @ResponseBody
    public User create(@RequestBody User users){
        return userService.save(users);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User search(@PathVariable Long id){
        return userService.search(id);
    }
}
