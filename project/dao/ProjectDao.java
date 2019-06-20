package com.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.project.model.Library;

@Component
public class ProjectDao {

	List<Library> project=new ArrayList<>();
	
	
	public Library create(Library library) {
		project.add(library);
		return library; 
	}
	
	public List<Library>getall(){
		return project;  
		
	}
	
//	public Library get(int id) {
//		
//		return project.get(id);
//		
//	}	

//	for (Library lib : booklist) {
//		System.out.println(
//lib.getBookId() + " " + lib.getBookName() + " " + lib.getAuthorName() + " " + lib.getPrice());
//
//	}

	
	public Library getids(long Id) {
	for (int i = 0; i < project.size(); i++) {
		
		if (project.get(i).getId() == Id) {
			return project.get(i);
		}
	
	}
	return null;
	}
	
	
	
	
	
	
	public void delete(int id) {
		project.remove(id);
	}
	
	public void update(int id,Library library) {
		project.set(id, library);
	
		
	}
	
	

}




	








