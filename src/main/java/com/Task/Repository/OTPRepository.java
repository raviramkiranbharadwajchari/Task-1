package com.Task.Repository;

import org.hibernate.dialect.lock.OptimisticEntityLockException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OTPRepository extends JpaRepository<OptimisticEntityLockException, String> {
    Optional<OptimisticEntityLockException> findByEmail(String email);
}
