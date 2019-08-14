package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
