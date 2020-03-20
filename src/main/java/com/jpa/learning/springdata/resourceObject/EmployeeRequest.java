package com.jpa.learning.springdata.resourceObject;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class EmployeeRequest {

	private Long id;
	@NotNull(message = "Employee name cannot be null")
	private String name;
	private BigDecimal salary;
	private BigDecimal hourlyWage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(BigDecimal hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
