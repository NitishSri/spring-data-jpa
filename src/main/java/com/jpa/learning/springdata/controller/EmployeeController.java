package com.jpa.learning.springdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.learning.springdata.resourceObject.EmployeeRequest;
import com.jpa.learning.springdata.resourceObject.EmployeeResponse;
import com.jpa.learning.springdata.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<EmployeeResponse>> getAllCourseDetails() {
		return ResponseEntity.ok().body(service.getAllEmployees());
	}

	@PostMapping(path = "/addOrUpdateEmployee", consumes = "application/json", produces = "application/json")
	public ResponseEntity<EmployeeResponse> addorUpdateEmployee(@Valid @RequestBody EmployeeRequest request) {
		return ResponseEntity.ok().body(service.addOrUpdateEmployee(request));
	}

	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(Long id) {
		return service.deleteEmployee(id);
	}

}
