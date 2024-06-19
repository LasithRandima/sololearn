package com.example.sololearn.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// work as a DAO(data access layer for Student entity

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    // JPQL query to find student by email - alternative to below
    @Query("SELECT s FROM Student s WHERE s.email = ?1")

    // create a custom function for find students by email
    // select * from student where email = ?
    Optional <Student> findStudentByEmail(String email);


}
