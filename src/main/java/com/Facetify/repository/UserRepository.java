package com.Facetify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
