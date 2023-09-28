package com.Facetify.controller;

import com.Facetify.entity.Publication;
import com.Facetify.service.PublicationService;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/publications")
@CrossOrigin(origins = "*")
@Log4j2 // to print in console
public class PublicationController {
	@Autowired
	PublicationService publicationService;

	@PostMapping
	public ResponseEntity<Publication> createPublication(@RequestBody Publication publication) {
		Publication newPublication = publicationService.createPublication(publication);
		log.info("Creating a new publication.");
		return new ResponseEntity<>(newPublication, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Publication> getPublicationById(@PathVariable Long id) {
		Publication publication = publicationService.getPublicationById(id);
		log.info("Getting a publication by Id.");
		return new ResponseEntity<>(publication, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Publication>> getAllPublications() {
		List<Publication> publications = publicationService.getAllPublications();
		log.info("Getting all publications.");
		return new ResponseEntity<>(publications, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Publication> updatePublication(@RequestBody Publication publication, @PathVariable Long id) {
		Publication updatePublication = publicationService.updatePublication(publication, id);
		log.info("Updating an existing publication.");
		return new ResponseEntity<>(updatePublication, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePublication(@PathVariable Long id) {
		publicationService.deletePublication(id);
		log.info("Deleting a publication.");
		return new ResponseEntity<>("Publication with id " + id + " has been successfully deleted.", HttpStatus.OK);
	}
}
