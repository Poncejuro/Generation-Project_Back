package com.Facetify.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	
//	Optional<Event> findByPublicationAndProfile(Publication publication, Profile profile);
//	Optional<Event> findByPublication(Publication publication);
}
