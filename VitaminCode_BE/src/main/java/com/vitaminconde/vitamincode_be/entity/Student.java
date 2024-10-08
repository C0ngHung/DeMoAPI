package com.vitaminconde.vitamincode_be.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private Integer classId;
}
