package com.iiht.projmgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.projmgmt.model.Project;
import com.iiht.projmgmt.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

	//public List<Book> findByTitle(String title);
}
