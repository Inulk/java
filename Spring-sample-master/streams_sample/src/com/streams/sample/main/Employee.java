package com.streams.sample.main;

public class Employee {

	public Employee(Integer id, String name, Integer age, String city, String role,String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = age;
		this.city = city;
		this.role = role;
		this.gender = gender;
	}
	private Integer id;
	private String name;
	private Integer salary;
	private String city;
	private String role;
	private String gender;
	
	/**
	 * @return the gender
	 */
	public final String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public final void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public final Integer getSalary() {
		return salary;
	}
	/**
	 * @param age the age to set
	 */
	public final void setSalary(Integer age) {
		this.salary = age;
	}
	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the role
	 */
	public final String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public final void setRole(String role) {
		this.role = role;
	}
	
}
