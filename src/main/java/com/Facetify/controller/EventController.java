package com.Facetify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Facetify.entity.Event;
import com.Facetify.service.EventService;

@RestController
@RequestMapping("api/profile-has-publication")
public class EventController {

	@Autowired
	EventService profileHasPublicationService;

	@PostMapping
	Event createProfileHasPublication(Event profileHasPublication) {
		return profileHasPublicationService.createProfileHasPublication(profileHasPublication);
	}

	@PostMapping("/query")
	Event getProfileHasPublicationById(@RequestParam Long profileId, @RequestParam Long publicationId) {
		return profileHasPublicationService.getProfileHasPublicationById(profileId, publicationId);
	}

	@PutMapping("/query")
	Event updateProfileHasPublication(@RequestBody Event profileHasPublication,
			@RequestParam Long profileId, @RequestParam Long publicationId) {
		return profileHasPublicationService.updateProfileHasPublication(profileHasPublication, profileId,
				publicationId);
	}

	@DeleteMapping("/query")
	void deleteProfileHasPublication(@RequestParam Long profileId, @RequestParam Long publicationId) {
		profileHasPublicationService.deleteProfileHasPublication(profileId, publicationId);
	}
}
