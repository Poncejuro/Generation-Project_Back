package com.Facetify.service;

import java.util.List;

import com.Facetify.entity.People;

public interface PeopleService {

	People createPeople(People people);

	People getPeopleById(Long peopleId);

	List<People> getAllPeople();

	void deletePeople(Long id);
}
