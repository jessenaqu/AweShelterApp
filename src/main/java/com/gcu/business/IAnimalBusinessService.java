package com.gcu.business;

import java.util.List;

import com.gcu.model.AnimalModel;

public interface IAnimalBusinessService 
{
	public AnimalModel getById(int Id);
	public List<AnimalModel> getAnimals();
	public List<AnimalModel> searchAnimals(String searchTerm);
	public int addOne(AnimalModel newAnimal);
	public boolean deleteOne(long id);
	public AnimalModel updateOne(long idToUpdate, AnimalModel updateAnimal);
}
