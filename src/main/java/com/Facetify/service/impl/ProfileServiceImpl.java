package com.Facetify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Facetify.entity.Profile;
import com.Facetify.repository.ProfileRepository;
import com.Facetify.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Profile createProfile(Profile profile) {
		return saveProfile(profile);
	}

	// this method will be used in createProfile and updateProfile
	public Profile saveProfile(Profile profile) {
		return profileRepository.save(profile);
	}

	@Override
	public Profile getProfileById(Long id) {
		return profileRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Profile with id: " + id + " does not exist."));
	}

	@Override
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
	}

	@Override
	public Profile updateProfile(Profile profile, Long id) {
		Profile existingProfile = getProfileById(id);
		existingProfile.setRole(profile.getRole());
		existingProfile.setBiography(profile.getBiography());
		existingProfile.setPhoto(profile.getPhoto());
		return saveProfile(existingProfile);
	}

	@Override
	public void deleteProfile(Long id) {
		Profile existingProfile = getProfileById(id);
		profileRepository.delete(existingProfile);
	}

}
