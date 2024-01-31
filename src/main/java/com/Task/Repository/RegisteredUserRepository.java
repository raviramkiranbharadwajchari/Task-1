package com.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUserRepository, Long> {
    Optional<RegisteredUserRepository> findByEmail(String email);
}
