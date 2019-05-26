package com.iiht.projmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.projmgmt.dao.ProjectRepository;
import com.iiht.projmgmt.dao.TaskRepository;
import com.iiht.projmgmt.dao.UserRepository;
import com.iiht.projmgmt.model.Project;
import com.iiht.projmgmt.model.Task;
import com.iiht.projmgmt.model.User;

@Service
public class ProjecMgmtService {

	@Autowired
	ProjectRepository projectRepo;
	
	@Autowired
	TaskRepository taskRepo;
	
	@Autowired
	UserRepository userRepo;
	
	public void addProject(Project project) {
		System.out.println("Add Project!!");
		projectRepo.save(project);
		
		System.out.println("project count: " +  projectRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}
	
	public void addTask(Task task) {
		System.out.println("Add task!!");
		taskRepo.save(task);
		
		System.out.println("task count: " +  taskRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}
	
	public void adduser(User user) {
		System.out.println("Add user!!");
		userRepo.save(user);
		
		System.out.println("user count: " +  userRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}	
}
