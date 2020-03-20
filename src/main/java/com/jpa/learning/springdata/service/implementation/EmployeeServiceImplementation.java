package com.jpa.learning.springdata.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.learning.springdata.repository.EmployeeRepository;
import com.jpa.learning.springdata.resourceObject.EmployeeRequest;
import com.jpa.learning.springdata.resourceObject.EmployeeResponse;
import com.jpa.learning.springdata.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public EmployeeResponse addOrUpdateEmployee(EmployeeRequest employeeReq) {
		return repository.addOrUpdateEmployee(employeeReq);
	}

	@Override
	public List<EmployeeResponse> getAllEmployees() {
		return repository.getAllEmployees();
	}

	@Override
	public String deleteEmployee(Long id) {
		return repository.deleteEmployee(id);
	}

}
