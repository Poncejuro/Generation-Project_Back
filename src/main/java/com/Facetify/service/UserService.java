package com.Facetify.service;

import com.Facetify.entity.User;
import com.Facetify.entity.limits.UserFieldLimits;

import java.util.List;

public interface UserService extends UserFieldLimits {

	User createUser(User user);

	User getUserById(Long id);

	List<User> getAllUsers();

	User getUserByEmail(String email);

	List<User> getAllActiveUsers();

	List<User> getAllInactiveUsers();

	User updateUser(User user, Long id);

	void deleteUser(Long id);
	
	void reactivateUser(Long id);

}
