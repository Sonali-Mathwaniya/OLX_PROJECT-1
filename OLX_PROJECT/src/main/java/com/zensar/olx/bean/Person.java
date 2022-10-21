package com.zensar.olx.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@XmlRootElement
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private Gender gender;
	private boolean eligible;
	private double salary;
	private char profession;
	public Person() {
		super();
	}
	public Person(String name, LocalDate dateOfBirth, Gender gender, boolean eligible, double salary, char profession) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.eligible = eligible;
		this.salary = salary;
		this.profession = profession;
	}
	public Person(int id, String name, LocalDate dateOfBirth, Gender gender, boolean eligible, double salary,
			char profession) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.eligible = eligible;
		this.salary = salary;
		this.profession = profession;
	}
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public boolean isEligible() {
		return eligible;
	}
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getProfession() {
		return profession;
	}
	public void setProfession(char profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", eligible=" + eligible + ", salary=" + salary + ", profession=" + profession + "]";
	}
	
	 
	 
}
