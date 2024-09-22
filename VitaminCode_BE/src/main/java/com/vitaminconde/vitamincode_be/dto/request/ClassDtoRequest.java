package com.vitaminconde.vitamincode_be.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClassDtoRequest {
    private Integer classId;
    private String className;
    private String classDescription;
}
