package com.Facetify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {



}
