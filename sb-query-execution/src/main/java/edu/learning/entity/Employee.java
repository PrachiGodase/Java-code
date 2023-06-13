package edu.learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Employee {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int id;
private String name;
@Column(nullable=false,unique=true)
private String email;
@Column(length=50)
private double experience;
private String city;
@Column(name="emp_sal")
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getExperience() {
	return experience;
}
public void setExperience(double experience) {
	this.experience = experience;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
