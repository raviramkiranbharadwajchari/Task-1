package com.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRegistrationRepository extends JpaRepository<EventsRegistrationRepository, Long> {
    List<EventsRegistrationRepository> findByUser(RegisteredUser user);
}
