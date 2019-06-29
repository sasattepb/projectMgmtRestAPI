package com.iiht.projmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.projmgmt.model.Project;
import com.iiht.projmgmt.model.Task;
import com.iiht.projmgmt.service.ProjecMgmtService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Task")
public class TaskMgmtController {

	@Autowired
	ProjecMgmtService operSvc;
	
	@RequestMapping(produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public Task addTask(@RequestBody Task task) {
		System.out.println("adding task");

		return operSvc.addTask(task);
	
		//return book2;
	}	
	
	@RequestMapping(produces = "application/json",  method = RequestMethod.GET)
	public List<Task> fetchTasks() {
		System.out.println("fetching tasks");

		return operSvc.fetchTasks();
	
		//return book2;
	}
}
