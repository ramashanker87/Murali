package com.murali.app.repository;

import com.murali.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<Student, Long> {
}
