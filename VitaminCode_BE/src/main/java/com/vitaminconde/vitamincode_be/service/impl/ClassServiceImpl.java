package com.vitaminconde.vitamincode_be.service.impl;

import com.vitaminconde.vitamincode_be.entity.ClassA;
import com.vitaminconde.vitamincode_be.mapper.ClassMapper;
import com.vitaminconde.vitamincode_be.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    private final ClassMapper classMapper;


    @Override
    public List<ClassA> findAllClassA() {
        if (!classMapper.selectAllClass().isEmpty()){
            return classMapper.selectAllClass();
        }
        return null;
    }

    @Override
    public ClassA selectClassAById(Integer classId) {
        var resultEntity = classMapper.selectClassById(classId);
        if (!Objects.isNull(resultEntity)){
            return resultEntity;
        }
        return null;
    }

    @Override
    public Integer insertClass(ClassA classA) {
        return classMapper.insertClassA(classA);
    }

    @Override
    public Integer updateClassA(ClassA classA) {
        return classMapper.updateClass(classA);
    }

    @Override
    public Integer deleteClassA(Integer classId) {
        return classMapper.deleteClassById(classId);
    }


}
