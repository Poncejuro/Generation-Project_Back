package com.Facetify.service;

import com.Facetify.entity.User;
import com.Facetify.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public User save(User user) {
		return userRepo.save(user);
	}

	public void delete(Long id) {
		userRepo.deleteById(id);
	}

	public List<User> list() {
		return userRepo.findAll();
	}

	public User search(Long id) {
		return userRepo.findById(id).orElse(null);
	}
}
