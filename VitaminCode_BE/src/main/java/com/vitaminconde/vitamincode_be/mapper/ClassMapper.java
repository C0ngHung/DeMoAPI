package com.vitaminconde.vitamincode_be.mapper;

import com.vitaminconde.vitamincode_be.entity.ClassA;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<ClassA> selectAllClass();

    ClassA selectClassById(@Param("id") Integer classId);

    int insertClassA (@Param("classA") ClassA classA);

    int updateClass(@Param("classA") ClassA classA);

    int deleteClassById(@Param("id") Integer classId);


}
