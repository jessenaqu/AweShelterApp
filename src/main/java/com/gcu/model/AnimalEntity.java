package com.gcu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("animal")
public class AnimalEntity 
{
	@Id
	@Column("Id")
	long id;
	
	@Column("Name")
	String name = "";
	
	@Column("Age")
	int age = 0;
	
	@Column("Weight")
	float weight = 0.0f;
	
	@Column("Breed")
	String breed = "";
	
	@Column("Description")
	String description = "";

	public AnimalEntity(long id, String name, int age, float weight, String breed, String description) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
