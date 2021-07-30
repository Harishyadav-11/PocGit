package com.poc.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {
	@Query(" from Admin where admin_email= :email and admin_password= :password")
	Optional<Admin> find(@Param("email") String uname, @Param("password") String upass);

}
