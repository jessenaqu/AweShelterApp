package com.gcu.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AnimalMapper implements RowMapper<AnimalModel>
{
/* Match the property names in ProcedureModel w/ the column names in the database
	
	Class			Table
	Properties		Column Names
	==============================
	id				Id
	name			Name
	age				Age
	weight			Weight
	breed			Breed
	description		Description
	
	*/
	
	public AnimalModel mapRow(ResultSet rs, int i) throws SQLException
	{
		AnimalModel animal = new AnimalModel(
				rs.getInt("Id"),
				rs.getString("Name"),
				rs.getInt("Age"),
				rs.getFloat("Weight"),
				rs.getString("Breed"),
				rs.getString("Description")
				);
		return animal;
	}
}
