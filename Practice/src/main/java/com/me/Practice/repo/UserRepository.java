package com.me.Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.Practice.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}