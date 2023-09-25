package com.Facetify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Facetify.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
