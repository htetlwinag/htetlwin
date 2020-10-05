package com.base.response.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.response.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
