package com.example.sololearn.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// work as a DAO(data access layer for Student entity

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
