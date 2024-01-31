package com.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TempRepository extends JpaRepository<RequestEntity.UriTemplateRequestEntity, String> {
    Optional<RequestEntity.UriTemplateRequestEntity> findByEmail(String email);
}
