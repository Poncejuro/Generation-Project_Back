package com.Facetify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Facetify.entity.People;
import com.Facetify.service.PeopleService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("api/v1/people")
@Log4j2 // to print in console
public class PeopleController {

	@Autowired
	PeopleService peopleService;

	@PostMapping
	public ResponseEntity<People> createPeople(@RequestBody People people) {
		People newPeople = peopleService.createPeople(people);
		log.info("Creating a new people.");
		return new ResponseEntity<>(newPeople, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<People> getPeopleById(@PathVariable Long id) {
		People people = peopleService.getPeopleById(id);
		log.info("Getting a people by Id.");
		return new ResponseEntity<>(people, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<People>> getAllPeoples() {
		List<People> people = peopleService.getAllPeople();
		log.info("Getting all people.");
		return new ResponseEntity<>(people, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePeople(@PathVariable Long id) {
		peopleService.deletePeople(id);
		log.info("Deleting a people.");
		return new ResponseEntity<>("People with id " + id + " has been successfully deleted.", HttpStatus.OK);
	}

}
