package com.gcu.data;

import java.util.List;

public interface IAnimalDataAccess <T>
{
	public T getById(int Id);
	public List<T> getAnimals();
	public List<T> searchAnimal(String searchTerm);
	public int addOne(T newAnimal);
	public boolean deleteOne(long id);
	public T updateOne(long idToUpdate, T updateAnimal);
}
