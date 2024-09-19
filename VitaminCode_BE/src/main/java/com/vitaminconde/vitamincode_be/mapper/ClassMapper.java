package com.vitaminconde.vitamincode_be.mapper;

import com.vitaminconde.vitamincode_be.entity.ClassA;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<ClassA> selectAllClass();
}
