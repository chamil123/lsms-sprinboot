package com.ic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ic.exception.ResourceNotFoundException;
import com.ic.model.User;
import com.ic.repository.RoleRepository;
import com.ic.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
		
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		
		return userRepository.save(user);
		
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		
		User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not exist with id"+id));
		
		return ResponseEntity.ok(user);
		
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable long id,@RequestBody User userDetails){
		
		User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not exist"+id));
		
		user.setUserfullname(userDetails.getUserfullname());
		user.setUseremail(userDetails.getUseremail());
		user.setUserimage(userDetails.getUserimage());
		user.setUsercontactnumber(userDetails.getUsercontactnumber());
		user.setUsergender(userDetails.getUsergender());
		user.setUserdob(userDetails.getUserdob());
		user.setUsernic(userDetails.getUsernic());
		user.setUseraddress(userDetails.getUseraddress());
		user.setUser_uname(userDetails.getUser_uname());
		user.setRole(userDetails.getRole());
		
		User updateUser=userRepository.save(user);
		
		return ResponseEntity.ok(updateUser);
		
		
		
	}
	
}
