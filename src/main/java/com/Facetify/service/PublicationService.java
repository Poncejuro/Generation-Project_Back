package com.Facetify.service;

import com.Facetify.entity.Publication;
import com.Facetify.entity.limits.PublicationFieldLimits;

import java.util.List;

public interface PublicationService extends PublicationFieldLimits {

	Publication createPublication(Publication publication);

	Publication getPublicationById(Long id);

	List<Publication> getAllPublications();

	Publication updatePublication(Publication publication, Long id);

	void deletePublication(Long id);
}
