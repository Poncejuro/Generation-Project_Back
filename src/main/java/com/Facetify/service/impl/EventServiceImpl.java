package com.Facetify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Facetify.entity.Event;
import com.Facetify.repository.EventRepository;
import com.Facetify.repository.ProfileRepository;
import com.Facetify.repository.PublicationRepository;
import com.Facetify.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;
	@Autowired
	ProfileRepository profileRepository;
	@Autowired
	PublicationRepository publicationRepository;

	@Override
	public Event createEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event getEventById(Long eventId) {
		return eventRepository.findById(eventId)
				.orElseThrow(() -> new IllegalStateException("Event with id: " + eventId + " does not exist."));
	}
	// public Event getEventById(Long profileId, Long publicationId) {
//	public Event getEventByPublicationId(Long publicationId) {
//		try {
//			Optional<Publication> existingpPublication = publicationRepository.findById(publicationId);
//			if (existingpPublication.isPresent()) {
//				Optional<Event> existingEvent = eventRepository.findByPublication(existingpPublication.get());
//				
//			}
//		} catch (Exception e) {
//
//		}
//		return null;
//		return eventRepository.
//				.findById(id)
//				.orElseThrow(() -> new IllegalStateException("Event with id: " + id + " does not exist."));
	// Optional<Profile> existingProfile = profileRepository.findById(profileId);
	// profileRepository.findById(profileId).orElseThrow(() -> new
	// IllegalStateException("Profile with id: " + profileId + " does not exist."));
	// publicationRepository.findById(publicationId).orElseThrow(() -> new
	// IllegalStateException("Publication with id: " + publicationId + " does not
	// exist."));
	// Optional<Publication> existingPublication
	// =publicationRepository.findById(publicationId);
//		try {
//			Optional<Profile> existingProfile = profileRepository.findById(profileId);
//			Optional<Publication> existingPublication = publicationRepository.findById(publicationId);
//			if (existingProfile.isPresent() && existingPublication.isPresent()) {
//
//			}
//		} catch (Exception e) {
//
//		}
//		return null;
//	}

	@Override
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

//	@Override
//	public Event updateEvent(Event ProfilePublication, Long profileId, Long publicationId) {
//		return null;
//	}

	@Override
//	public void deleteEvent(Long profileId, Long publicationId) {
	public void deleteEvent(Long eventId) {
		Event existingEvent = getEventById(eventId);
		eventRepository.delete(existingEvent);
	}

}
