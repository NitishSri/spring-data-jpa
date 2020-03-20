package com.jpa.learning.springdata.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.learning.springdata.model.Employee;
import com.jpa.learning.springdata.model.FullTimeEmployee;
import com.jpa.learning.springdata.model.PartTimeEmployee;
import com.jpa.learning.springdata.resourceObject.EmployeeRequest;
import com.jpa.learning.springdata.resourceObject.EmployeeResponse;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	EntityManager em;

	public EmployeeResponse addOrUpdateEmployee(EmployeeRequest employeeReq) {
		Employee employee = null != employeeReq.getId() ? em.find(Employee.class, employeeReq.getId()) : null;
		ModelMapper modelMapper = new ModelMapper();
		FullTimeEmployee fullTimeEmp;
		PartTimeEmployee partTimeEmp;
		if (null != employeeReq.getSalary()) {
			fullTimeEmp = modelMapper.map(employeeReq, FullTimeEmployee.class);
			if (Objects.isNull(employee)) {
				em.persist(fullTimeEmp);
			} else {
				em.merge(fullTimeEmp);
			}
			return modelMapper.map(fullTimeEmp, EmployeeResponse.class);
		} else {
			partTimeEmp = modelMapper.map(employeeReq, PartTimeEmployee.class);
			if (Objects.isNull(employee)) {
				em.persist(partTimeEmp);
			} else {
				em.merge(partTimeEmp);
			}
			return modelMapper.map(partTimeEmp, EmployeeResponse.class);
		}

	}

	public List<EmployeeResponse> getAllEmployees() {
		List<Employee> listEmployee = em.createQuery("select e from Employee e", Employee.class).getResultList();
		ModelMapper modelMapper = new ModelMapper();
		List<EmployeeResponse> list = Arrays.asList(modelMapper.map(listEmployee, EmployeeResponse[].class));
		return list;

	}

	public String deleteEmployee(Long id) {
		Employee employee = em.find(Employee.class, id);
		String message = Strings.EMPTY;
		if (Objects.isNull(employee)) {
			message = "No Employee found with this id";
		} else {
			em.remove(employee);
			message = "Employee with id " + id + " has been deleted";
		}
		return message;
	}

}
