package com.example.Facetify.service;

import com.example.Facetify.entity.Publications;
import com.example.Facetify.repository.PublicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationsService {
    @Autowired
    //se exporta desde profileRepository para instanciarlo.
    PublicationsRepository publicationsRepo;

    public Publications save(Publications publications) {return publicationsRepo.save(publications);
    }
    public void delete(Long id){
        publicationsRepo.deleteById(id);
    }
    public List<Publications> list(){
        return publicationsRepo.findAll();
    }
    public Publications search(Long id){
        return publicationsRepo.findById(id).orElse(null);
    }
}
