package com.vitaminconde.vitamincode_be.service;

import com.vitaminconde.vitamincode_be.entity.ClassA;

import java.util.List;

public interface ClassService {
    List<ClassA> findAllClassA  ();

    ClassA selectClassAById(Integer classId);

    Integer insertClass(ClassA classA);

    Integer updateClassA(ClassA classA);

    Integer deleteClassA(Integer classId);

}
