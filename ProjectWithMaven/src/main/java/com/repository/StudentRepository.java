package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}
