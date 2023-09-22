package com.example.Facetify.controller;

import com.example.Facetify.entity.Profile;
import com.example.Facetify.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping ("/profile")
    @ResponseBody
    public List<Profile> list(){
        return profileService.list();
    }
    @PostMapping("/profile")
    @ResponseBody
    public Profile create(@RequestBody Profile profile){
        return profileService.save(profile);
    }
    @DeleteMapping("/profile/{id_profile}")
    public void delete(@PathVariable Long id){
        profileService.delete(id);
    }
    @GetMapping("/profile/{id_profile}")
    @ResponseBody
    public Profile search(@PathVariable Long id){
        return profileService.search(id);
    }
}
