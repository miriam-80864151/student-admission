package com.example.studentadmission.repository;

import com.example.studentadmission.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
