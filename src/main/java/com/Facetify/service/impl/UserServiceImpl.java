package com.Facetify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Facetify.entity.User;
import com.Facetify.repository.UserRepository;
import com.Facetify.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return saveUser(user);
	}

	// this method is used in createUser, updateUser and deleteUser
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("User with id: " + id + " does not exist."));
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email)
				.orElseThrow(() -> new IllegalStateException("User with email: " + email + "does not exist."));
	}

	@Override
	public List<User> getAllActiveUsers() {
		return userRepository.findAllByActive(true);
	}

	@Override
	public List<User> getAllInactiveUsers() {
		return userRepository.findAllByActive(false);
	}

	@Override
	public User updateUser(User user, Long id) {
		User existingUser = getUserById(id);
		existingUser.setFullName(user.getFullName());
		existingUser.setPassword(user.getPassword());
		existingUser.setEmail(user.getEmail());
		existingUser.setCellphone(user.getCellphone());
		return saveUser(existingUser);
	}

	@Override
	public void deleteUser(Long id) {
//		User existingUser = getUserById(id);
//		userRepository.delete(existingUser);
		User existingUser = getUserById(id);
		existingUser.setActive(false);
		saveUser(existingUser);
	}

	@Override
	public void reactivateUser(Long id) {
		User existingUser = getUserById(id);
		existingUser.setActive(true);
		saveUser(existingUser);
	}

}
