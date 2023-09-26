package com.Facetify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Facetify.entity.Publication;
import com.Facetify.repository.PublicationRepository;
import com.Facetify.service.PublicationService;

@Service
public class PublicationServiceImpl implements PublicationService {

	@Autowired
	PublicationRepository publicationRepository;

	@Override
	public Publication createPublication(Publication publication) {
		return savePublication(publication);
	}

	// this method will be used in createPublication and updatePublication
	public Publication savePublication(Publication publication) {
		return publicationRepository.save(publication);
	}

	@Override
	public Publication getPublicationById(Long id) {
		return publicationRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Publication with id: " + id + " does not exist."));
	}

	@Override
	public List<Publication> getAllPublications() {
		return publicationRepository.findAll();
	}

	@Override
	public Publication updatePublication(Publication publication, Long id) {
		Publication existingPublication = getPublicationById(id);
		existingPublication.setTitle(publication.getTitle());
		existingPublication.setFooter(publication.getFooter());
		existingPublication.setEventDetails(publication.getEventDetails());
		existingPublication.setImg(publication.getImg());
		return savePublication(existingPublication);
	}

	@Override
	public void deletePublication(Long id) {
		Publication existingPublication = getPublicationById(id);
		publicationRepository.delete(existingPublication);
	}

}
