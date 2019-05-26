package com.iiht.projmgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.projmgmt.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	//public List<Book> findByTitle(String title);
}
