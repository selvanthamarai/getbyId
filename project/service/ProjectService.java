package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.ProjectDao;
import com.project.model.Library;

@Component
public class ProjectService {

	@Autowired
	ProjectDao projectDao;

	
	public Library create(Library library) {
		return projectDao.create(library);
	}

	public List<Library> getall(){
		return projectDao.getall();
		
	}
	
	
	public Library get(long Id) {
		return projectDao.getids(Id);
	}
	
	
	
	
	
	
	
	
//	public Library get(int id) {
//		return projectDao.get(id);
//	}
//	
	public void del(int id) {
		projectDao.delete(id);
	}
		
	public void up(int id,Library library) {
		projectDao.update(id,library);
	}
	
	
}
  