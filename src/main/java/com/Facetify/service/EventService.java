package com.Facetify.service;

import java.util.List;

import com.Facetify.entity.Event;

public interface EventService {

	Event createEvent(Event event);

//	Event getEventByPublicationId(Long publicationId);
//	Event getEventById(Long profileId, Long publicationId);
//	Event getEventById(Long profileId, Long publicationId);
	Event getEventById(Long eventId);

	List<Event> getAllEvents();

//	Event updateEvent(Event event, Long profileId, Long publicationId);

//	void deleteEvent(Long profileId, Long publicationId);
	void deleteEvent(Long eventId);

}
