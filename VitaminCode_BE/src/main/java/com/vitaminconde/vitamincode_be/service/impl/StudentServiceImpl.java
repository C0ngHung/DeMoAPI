package com.vitaminconde.vitamincode_be.service.impl;

import com.vitaminconde.vitamincode_be.entity.Student;
import com.vitaminconde.vitamincode_be.mapper.StudentMapper;
import com.vitaminconde.vitamincode_be.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        if (!studentMapper.getAllStudents().isEmpty()) {
            return studentMapper.getAllStudents();
        }
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        if (studentMapper.getStudentById(id) != null) {
            return studentMapper.getStudentById(id);
        }
        return null;
    }

    @Override
    public int addStudent(Student student) {
        if (studentMapper.addStudent(student) > 0) {
            return studentMapper.addStudent(student);
        }
        return 1;
    }

    @Override
    public int updateStudent(Student student) {
        if (studentMapper.updateStudent(student) > 0) {
            return studentMapper.updateStudent(student);
        }
        return 1;
    }

    @Override
    public int deleteStudent(int id) {
        if (studentMapper.deleteStudent(id) > 0) {
            return studentMapper.deleteStudent(id);
        }
        return 1;
    }
}
