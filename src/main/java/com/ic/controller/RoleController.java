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
import org.springframework.web.bind.annotation.RestController;

import com.ic.exception.ResourceNotFoundException;
import com.ic.model.Role;
import com.ic.repository.RoleRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/roles")
	public List<Role> getAllRole(){
		
		
		return roleRepository.findAll();
		
	}
	
	@PostMapping("/role")
	public Role createRole(@RequestBody Role role) {
		
		return roleRepository.save(role);
		
		
	}
	
	@GetMapping("/role/{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable Long id){
		
		Role role=roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Role not exist with id"+id));
		
		return ResponseEntity.ok(role);
		
	}
	
	@PutMapping("/role/{id}")
	public ResponseEntity<Role> updateRole(@PathVariable Long id,@RequestBody Role roleDetails){
		
		Role role=roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Role not exist"+id));
		
		role.setRolename(roleDetails.getRolename());
		
		Role updateRole=roleRepository.save(role);
		
		return ResponseEntity.ok(updateRole);
		
	}
	

}
