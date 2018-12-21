package com.sinol.oauth.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sinol.oauth.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("SELECT DISTINCT u FROM User u WHERE u.userName = :username")
	User findByUsername(@Param("username") String username);
}