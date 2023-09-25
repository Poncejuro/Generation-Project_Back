package com.Facetify.controller;

import com.Facetify.entity.Publication;
import com.Facetify.service.PublicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublicationController {
    @Autowired
    PublicationService publicationsService;

    @GetMapping ("/publications")
    @ResponseBody
    public List<Publication> list(){
        return publicationsService.list();
    }
    @PostMapping("/publications")
    @ResponseBody
    public Publication create(@RequestBody Publication publications){
        return publicationsService.save(publications);
    }
    @DeleteMapping("/publications/{id_publication}")
    public void delete(@PathVariable Long id){
        publicationsService.delete(id);
    }
    @GetMapping("/publications/{id_publication}")
    @ResponseBody
    public Publication search(@PathVariable Long id){
        return publicationsService.search(id);
    }
}
