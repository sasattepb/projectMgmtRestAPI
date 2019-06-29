package com.iiht.projmgmt.service;

import java.util.List;

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
	
	public Project addProject(Project project) {
		System.out.println("Add Project!!");
		return projectRepo.save(project);
		
		//System.out.println("project count: " +  projectRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}
	
	public Task addTask(Task task) {
		System.out.println("Add task!!");
		return taskRepo.save(task);
		
		//System.out.println("task count: " +  taskRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}
	
	public User addUser(User user) {
		System.out.println("Add user!!");
		return userRepo.save(user);
		
		//System.out.println("user count: " +  userRepo.count());
		//Book book = bookRepo.findOne(bookDtls.getBookId());
		//System.out.println("Book added: " + book.toString());
		//return book;
	}

	public List<Project> fetchProjects() {
		List<Project> projList =  (List<Project>) projectRepo.findAll();
		return projList;
	}

	public List<Task> fetchTasks() {
		List<Task> taskList =  (List<Task>) taskRepo.findAll();
		return taskList;
	}
	
	
	public List<User> fetchUsers() {
		List<User> userList =  (List<User>) userRepo.findAll();
		return userList;
	}
}
