package com.Facetify.service;

import com.Facetify.entity.Profile;
import com.Facetify.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
	@Autowired
	// se exporta desde profileRepository para instanciarlo.
	ProfileRepository profileRepo;

	public Profile save(Profile profile) {
		return profileRepo.save(profile);
	}

	public void delete(Long id) {
		profileRepo.deleteById(id);
	}

	public List<Profile> list() {
		return profileRepo.findAll();
	}

	public Profile search(Long id) {
		return profileRepo.findById(id).orElse(null);
	}
}
