package com.Facetify.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Facetify.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAllByActive(boolean active);

	Optional<User> findByEmail(String email);
}
