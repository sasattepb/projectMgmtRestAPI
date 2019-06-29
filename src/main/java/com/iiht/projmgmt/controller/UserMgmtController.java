package com.iiht.projmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.projmgmt.model.Task;
import com.iiht.projmgmt.model.User;
import com.iiht.projmgmt.service.ProjecMgmtService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/User")
public class UserMgmtController {


	@Autowired
	ProjecMgmtService operSvc;
	
	@RequestMapping(produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		System.out.println("adding user");

		return operSvc.addUser(user);
	
		//return book2;
	}	

	@RequestMapping(produces = "application/json",  method = RequestMethod.GET)
	public List<User> fetchUsers() {
		System.out.println("fetching users");

		return operSvc.fetchUsers();
	
		//return book2;
	}
}
