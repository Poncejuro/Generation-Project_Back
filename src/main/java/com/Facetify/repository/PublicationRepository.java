package com.Facetify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {

}
