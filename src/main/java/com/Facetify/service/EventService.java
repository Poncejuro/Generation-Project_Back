package com.Facetify.service;

import com.Facetify.entity.Event;

public interface EventService {
	Event createProfileHasPublication(Event profilePublication);

	Event getProfileHasPublicationById(Long profileId, Long publicationId);

	Event updateProfileHasPublication(Event ProfilePublication, Long profileId,
			Long publicationId);

	void deleteProfileHasPublication(Long profileId, Long publicationId);

}
