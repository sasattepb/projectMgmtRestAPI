package com.iiht.projmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.projmgmt.model.Task;
import com.iiht.projmgmt.service.ProjecMgmtService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserMgmtController {


	@Autowired
	ProjecMgmtService operSvc;
	
	@RequestMapping(value = "/addUser", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public void addTask(@RequestBody Task task) {
		System.out.println("adding user");

		operSvc.addTask(task);
	
		//return book2;
	}	

}
