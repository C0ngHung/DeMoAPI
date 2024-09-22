package com.vitaminconde.vitamincode_be.service;

import com.vitaminconde.vitamincode_be.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(int id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);
}
