package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// This interface automatically gives us save(), findAll(), delete() methods for free.
public interface SessionLogRepository extends JpaRepository<SessionLog, Long> {
}
