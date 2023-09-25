package com.Facetify.service;

import com.Facetify.entity.Publication;
import com.Facetify.repository.PublicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {
	@Autowired
	// se exporta desde profileRepository para instanciarlo.
	PublicationRepository publicationsRepo;

	public Publication save(Publication publications) {
		return publicationsRepo.save(publications);
	}

	public void delete(Long id) {
		publicationsRepo.deleteById(id);
	}

	public List<Publication> list() {
		return publicationsRepo.findAll();
	}

	public Publication search(Long id) {
		return publicationsRepo.findById(id).orElse(null);
	}
}
