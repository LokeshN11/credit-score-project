package com.lokesh.creditscore.repository;

import com.lokesh.creditscore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}