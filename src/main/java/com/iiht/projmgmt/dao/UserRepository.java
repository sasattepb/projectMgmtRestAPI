package com.iiht.projmgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.projmgmt.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	//public List<Book> findByTitle(String title);
}
