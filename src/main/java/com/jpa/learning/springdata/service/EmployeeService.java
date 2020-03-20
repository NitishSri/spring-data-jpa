package com.jpa.learning.springdata.service;

import java.util.List;

import com.jpa.learning.springdata.resourceObject.EmployeeRequest;
import com.jpa.learning.springdata.resourceObject.EmployeeResponse;

public interface EmployeeService {

	public EmployeeResponse addOrUpdateEmployee(EmployeeRequest employeeReq);

	public List<EmployeeResponse> getAllEmployees();

	public String deleteEmployee(Long id);

}
