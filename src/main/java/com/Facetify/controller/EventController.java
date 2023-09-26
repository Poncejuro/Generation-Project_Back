package com.Facetify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Facetify.entity.Event;
import com.Facetify.service.EventService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("api/v1/events")
@Log4j2 // to print in console
public class EventController {

	@Autowired
	EventService eventService;

	@PostMapping
	public ResponseEntity<Event> createEvent(@RequestBody Event event) {
		Event newEvent = eventService.createEvent(event);
		log.info("Creating a new event.");
		return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Event> getEventById(@PathVariable Long id) {
		Event Event = eventService.getEventById(id);
		log.info("Getting a Event by Id.");
		return new ResponseEntity<>(Event, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Event>> getAllEvents() {
		List<Event> Events = eventService.getAllEvents();
		log.info("Getting all Events.");
		return new ResponseEntity<>(Events, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEvent(@PathVariable Long id) {
		eventService.deleteEvent(id);
		log.info("Deleting a Event.");
		return new ResponseEntity<>("Event with id " + id + " has been successfully deleted.", HttpStatus.OK);
	}

//	@PostMapping("/query")
//	Event getEventById(@RequestParam Long profileId, @RequestParam Long publicationId) {
//		return eventService.getEventById(profileId, publicationId);
//	}
//
//	@PutMapping("/query")
//	Event updateEvent(@RequestBody Event Event, @RequestParam Long profileId, @RequestParam Long publicationId) {
//		return eventService.updateEvent(Event, profileId, publicationId);
//	}
//
//	@DeleteMapping("/query")
//	void deleteEvent(@RequestParam Long profileId, @RequestParam Long publicationId) {
//		eventService.deleteEvent(profileId, publicationId);
//	}
}
