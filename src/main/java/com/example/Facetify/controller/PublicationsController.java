package com.example.Facetify.controller;

import com.example.Facetify.entity.Publications;
import com.example.Facetify.service.PublicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublicationsController {
    @Autowired
    PublicationsService publicationsService;

    @GetMapping ("/publications")
    @ResponseBody
    public List<Publications> list(){
        return publicationsService.list();
    }
    @PostMapping("/publications")
    @ResponseBody
    public Publications create(@RequestBody Publications publications){
        return publicationsService.save(publications);
    }
    @DeleteMapping("/publications/{id_publication}")
    public void delete(@PathVariable Long id){
        publicationsService.delete(id);
    }
    @GetMapping("/publications/{id_publication}")
    @ResponseBody
    public Publications search(@PathVariable Long id){
        return publicationsService.search(id);
    }
}
