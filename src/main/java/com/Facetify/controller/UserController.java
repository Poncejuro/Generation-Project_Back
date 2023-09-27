package com.Facetify.controller;

import com.Facetify.entity.User;
import com.Facetify.service.UserService;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@Log4j2 // to print in console
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
		log.info("Creating a new user.");
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		User user = userService.getUserById(id);
		log.info("Getting a user by Id.");
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		log.info("Getting all users.");
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("active")
	public ResponseEntity<List<User>> getAllActiveUsers() {
		List<User> activeUsers = userService.getAllActiveUsers();
		log.info("Getting all active users.");
		return new ResponseEntity<>(activeUsers, HttpStatus.OK);
	}

	@GetMapping("inactive")
	public ResponseEntity<List<User>> getAllInactiveUsers() {
		List<User> inactiveUsers = userService.getAllInactiveUsers();
		log.info("Getting all inactive users.");
		return new ResponseEntity<>(inactiveUsers, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
		User updateUser = userService.updateUser(user, id);
		log.info("Updating an existing user.");
		return new ResponseEntity<>(updateUser, HttpStatus.OK);
	}

	@PutMapping("reactivate/{id}")
	public ResponseEntity<String> reactivateUser(@PathVariable Long id) {
		userService.reactivateUser(id);
		log.info("Reactivating an existing user.");
		return new ResponseEntity<>("User with id " + id + " has been successfully reactivated.", HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		log.info("Deactivating a user.");
		return new ResponseEntity<>("User with id " + id + " has been successfully deactivated.", HttpStatus.OK);
	}

}
