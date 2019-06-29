package com.iiht.projmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.projmgmt.model.Project;
import com.iiht.projmgmt.service.ProjecMgmtService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Project")
public class ProjectMgmtController {

	@Autowired
	ProjecMgmtService operSvc;
	
	@RequestMapping(produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public Project addProject(@RequestBody Project newProject) {
		System.out.println("adding book");

		return operSvc.addProject(newProject);
	
		//return book2;
	}

	@RequestMapping(produces = "application/json",  method = RequestMethod.GET)
	public List<Project> fetchProjects() {
		System.out.println("fetching projects");

		return operSvc.fetchProjects();
	
		//return book2;
	}

}
