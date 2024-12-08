package com.example.jwtauth0126.repository;

import com.example.jwtauth0126.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String email);

    boolean existsByEmail(String email);
}
