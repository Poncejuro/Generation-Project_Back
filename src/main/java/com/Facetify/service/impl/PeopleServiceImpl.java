package com.Facetify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Facetify.entity.People;
import com.Facetify.repository.PeopleRepository;
import com.Facetify.repository.ProfileRepository;
import com.Facetify.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	PeopleRepository peopleRepository;
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public People createPeople(People people) {
		return peopleRepository.save(people);
	}

	@Override
	public People getPeopleById(Long peopleId) {
		return peopleRepository.findById(peopleId)
				.orElseThrow(() -> new IllegalStateException("People with id: " + peopleId + " does not exist."));
	}

	@Override
	public List<People> getAllPeople() {
		return peopleRepository.findAll();
	}

	@Override
	public void deletePeople(Long peopleId) {
		People existingPeople = getPeopleById(peopleId);
		peopleRepository.delete(existingPeople);
	}

}
