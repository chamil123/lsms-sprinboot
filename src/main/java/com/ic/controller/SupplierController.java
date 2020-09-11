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
import com.ic.model.Supplier;
import com.ic.repository.SupplierRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class SupplierController {

	@Autowired
	private SupplierRepository supplierRepository;
	
	@GetMapping("/suppliers")
	public List<Supplier> getAllSuppliers(){
		
		return supplierRepository.findAll();
		
	}
	
	@PostMapping("/supplier")
	public Supplier createSupplier(@RequestBody Supplier supplier) {
		
		return supplierRepository.save(supplier);
		
	}
	
	@GetMapping("/supplier/{id}")
	public ResponseEntity<Supplier> getSupplierById(@PathVariable Long id){
		
		Supplier supplier=supplierRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Supplier not exist with id"+id));
		
		return ResponseEntity.ok(supplier);
		
	}
	
	@PutMapping("/supplier/{id}")
	public ResponseEntity<Supplier> updateSupplier(@PathVariable Long id,@RequestBody Supplier supplierDetails){
		
			Supplier supplier=supplierRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Supplier not exist"+id));
			
			supplier.setSupfullname(supplierDetails.getSupfullname());
			supplier.setSupofficenumber(supplierDetails.getSupofficenumber());
			supplier.setSupmobilenumber(supplierDetails.getSupmobilenumber());
			supplier.setSupemail(supplierDetails.getSupemail());
			supplier.setSupaddress(supplierDetails.getSupaddress());
			supplier.setSupremark(supplierDetails.getSupremark());
			
			Supplier updateSupplier=supplierRepository.save(supplier);
			
			return ResponseEntity.ok(updateSupplier);
		
		
	}
	
	
	
}
