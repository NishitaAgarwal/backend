package com.cg.nutritionapp.repository;
import com.cg.nutritionapp.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDAO extends JpaRepository<User, Long>{
	
	
	 public User save(User user);  //to save
	 
	public List<User> findAll(); //to findall
	 
	 public User findByUserIdentification(String userIdentification); //to identify user
	 
	 
	 public void delete(User user);
}
