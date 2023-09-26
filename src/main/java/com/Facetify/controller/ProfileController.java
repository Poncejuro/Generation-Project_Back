package com.Facetify.controller;

import com.Facetify.entity.Profile;
import com.Facetify.service.ProfileService;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/profiles")
@Log4j2 // to print in console
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@PostMapping
	public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
		Profile newProfile = profileService.createProfile(profile);
		log.info("Creating a new profile.");
		return new ResponseEntity<>(newProfile, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Profile> getProfileById(@PathVariable Long id) {
		Profile profile = profileService.getProfileById(id);
		log.info("Getting a profile by Id.");
		return new ResponseEntity<>(profile, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Profile>> getAllProfiles() {
		List<Profile> profiles = profileService.getAllProfiles();
		log.info("Getting all profiles.");
		return new ResponseEntity<>(profiles, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile, @PathVariable Long id) {
		Profile updateProfile = profileService.updateProfile(profile, id);
		log.info("Updating an existing profile.");
		return new ResponseEntity<>(updateProfile, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProfile(@PathVariable Long id) {
		profileService.deleteProfile(id);
		log.info("Deleting a profile.");
		return new ResponseEntity<>("Profile with id " + id + " has been successfully deleted.", HttpStatus.OK);
	}
}
