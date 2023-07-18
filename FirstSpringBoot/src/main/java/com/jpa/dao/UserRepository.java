package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
		public List<User> findByName(String name);
		
		@Query("select u from User u")
		public List<User> getAllUsers();
		
		@Query("select u from User u ")
		public List<User> getUserByName(String name);
		
		@Query("select u from User u where u.name=:n and u.city=:c")
		public List<User> getUserByNameandCity(@Param("n") String name, @Param("c")String City);
}
