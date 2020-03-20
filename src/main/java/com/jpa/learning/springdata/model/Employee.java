package com.jpa.learning.springdata.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorColumn(name = "EmployeeType")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@NotNull
	private String name;

	@GeneratedValue
	@Id
	private Long id;

	protected  Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
