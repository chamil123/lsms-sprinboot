package com.ic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ic.exception.ResourceNotFoundException;
import com.ic.model.Customer;
import com.ic.repository.CustomerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		System.out.println("sdasdasd asd asd asd asd as: >>>>>>>>>>> : ");
		return customerRepository.findAll();
	}

	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		System.out.println("sdasdasd asd asd asd asd as: >>>>>>>>>>> : "+customer);
		return customerRepository.save(customer);
		
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		
		Customer customer=customerRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("employee not exist with id :"+id));
		return ResponseEntity.ok(customer);
	}
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customerDetails){
		Customer customer =customerRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not exit "+id));
		
		customer.setCusfullname(customerDetails.getCusfullname());
		customer.setCusNicNumber(customerDetails.getCusNicNumber());
		customer.setCusfullname(customerDetails.getCusfullname());
		customer.setCusfullname(customerDetails.getCusfullname());
		
		Customer updateCustomer=customerRepository.save(customer);
		return ResponseEntity.ok(updateCustomer);
		
	}
}
