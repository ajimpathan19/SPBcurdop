package com.floating.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataEntry {
	@Autowired
	private DataRepository repo;

	public List<Data> listAll() {
		
		return repo.findAll();
	}
	
	public void save(Data data)
	{
		repo.save(data);
	}
	
	public Data get(Long id)
	{
		return repo.findById(id).get();
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}



}
