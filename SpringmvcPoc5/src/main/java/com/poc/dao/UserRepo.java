package com.poc.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>  {
	
	@Query("from User where user_email= :email and user_password= :password")
	Optional<User> find(@Param("email") String uname, @Param("password") String upass);

}
