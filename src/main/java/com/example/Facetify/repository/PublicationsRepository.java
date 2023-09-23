package com.example.Facetify.repository;

import com.example.Facetify.entity.Profile;
import com.example.Facetify.entity.Publications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationsRepository extends JpaRepository<Publications,Long> {



}
