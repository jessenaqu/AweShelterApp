package com.gcu.model;

public class AnimalModel 
{
	long id = 0;
	String name = "";
	int age = 0;
	float weight = 0.0f;
	String breed = "";
	String description = "";
	
	public AnimalModel(long id, String name, int age, float weight, String breed, String description) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
		this.description = description;
	}

	public AnimalModel() {}
	
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
