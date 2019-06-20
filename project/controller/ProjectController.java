package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Library;
import com.project.service.ProjectService;

@RestController
@RequestMapping("project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("create")
	private Library create(@RequestBody Library library) {
		return projectService.create(library);
		
	}
	
	@GetMapping("getall")
	private List<Library>getall(){
		return projectService.getall();
	}

	
	@GetMapping("get/{Id}")
	
	private Library getid(@PathVariable("Id")long Id) {
		return projectService.get(Id);
	}
	
	
	
	
//	@GetMapping("get/{Id}")
//	private Library get(@PathVariable("Id")int id ) {
//		return projectService.get(id);
//	}

	
	@DeleteMapping("delete/{Id}")
	private void delete(@PathVariable("Id")int id) {
		projectService.del(id);
	} 
	
	
	@PostMapping("update/{Id}")
	private void update(@PathVariable("Id")int id,@RequestBody Library library) {
		projectService.up(id,library);
	}
		
	
	}
	
