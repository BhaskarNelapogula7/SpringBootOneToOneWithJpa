package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.entity.UserInfo;
import com.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		
	return userRepository.save(user);
	}

	public List<User> fetchAllUsers() {

		return userRepository.findAll();

	}

	public User fetchById(Integer id) {

		return userRepository.findById(id).get();
	
	}
	
	public void deleteUserById(Integer id) {
		 userRepository.deleteById(id);
	}
}
