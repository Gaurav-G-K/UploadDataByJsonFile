package com.data.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Users;

public interface UserRepo extends JpaRepository<Users, Long>{

	Optional<Users> findByEmail(String email);
}
