package com.vitaminconde.vitamincode_be.mapper;

import com.vitaminconde.vitamincode_be.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getAllStudents();

    Student getStudentById(int id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);

}
