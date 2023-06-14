package com.app.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {

		return userService.saveUser(user);
	}

	@GetMapping("/fetchall")
	public List<User> fetchAllUsers() {

		return userService.fetchAllUsers();
	}
	
	@GetMapping("/fetchbyid/{id}")
	public User fetchById(@PathVariable Integer id) {
		
		return userService.fetchById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Integer id) {
	    userService.deleteUserById(id);
	    return new ResponseEntity("user associated data id=" + id + "deleted successfully", HttpStatus.OK);
	}
}
