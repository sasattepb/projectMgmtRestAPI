package com.iiht.projmgmt.controller;

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
@RequestMapping("/project")
public class ProjectMgmtController {

	@Autowired
	ProjecMgmtService operSvc;
	
	@RequestMapping(value = "/addProject", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public void addBook(@RequestBody Project project) {
		System.out.println("adding book");

		operSvc.addProject(project);
	
		//return book2;
	}
	

}
