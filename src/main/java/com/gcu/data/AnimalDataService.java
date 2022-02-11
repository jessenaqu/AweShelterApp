package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.model.AnimalEntity;

@Service
public class AnimalDataService implements IAnimalDataAccess<AnimalEntity> 
{
	@Autowired
	private AnimalRepository animalRepository;
	@SuppressWarnings("unused")
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	// Non-Default Constructor
	public AnimalDataService(AnimalRepository animalRepository, DataSource dataSource)
	{
		this.animalRepository = animalRepository;
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public AnimalEntity getById(int Id) {
		return animalRepository.findById((long) Id).orElse(null);
	}

	@Override
	public List<AnimalEntity> getAnimals() {
		List<AnimalEntity> animals = (List<AnimalEntity>) animalRepository.findAll();
		return animals;
	}

	@Override
	public List<AnimalEntity> searchAnimal(String searchTerm) {
		List<AnimalEntity> result = animalRepository.findByNameContainingIgnoreCase(searchTerm);
		return result;
	}

	@Override
	public int addOne(AnimalEntity newAnimal) {
		AnimalEntity result = animalRepository.save(newAnimal);
		if (result == null)
        {
            return 0;
        }
        return (int) result.getId();
	}

	@Override
	public boolean deleteOne(long id) {
		animalRepository.deleteById(id);
		return true;
	}

	@Override
	public AnimalEntity updateOne(long idToUpdate, AnimalEntity updateAnimal) {
		AnimalEntity result = animalRepository.save(updateAnimal);
		return result;
	}
}
