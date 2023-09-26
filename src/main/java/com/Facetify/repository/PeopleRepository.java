package com.Facetify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
