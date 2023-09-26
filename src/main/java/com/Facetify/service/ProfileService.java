package com.Facetify.service;

import com.Facetify.entity.Profile;
import com.Facetify.entity.limits.ProfileFieldLimits;

import java.util.List;

public interface ProfileService extends ProfileFieldLimits {

	Profile createProfile(Profile profile);

	Profile getProfileById(Long id);

	List<Profile> getAllProfiles();

	Profile updateProfile(Profile profile, Long id);

	void deleteProfile(Long id);

}
