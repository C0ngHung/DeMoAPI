package com.vitaminconde.vitamincode_be.controller;


import com.vitaminconde.vitamincode_be.entity.Student;
import com.vitaminconde.vitamincode_be.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getAllStudents")
    public ResponseEntity <?> getAllStudents() {
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", studentService.getAllStudents());
        } catch (Exception e) {
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message",e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @GetMapping("/getStudentById/{id}")
    public ResponseEntity <?> getStudentById(@PathVariable Integer id) {
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", studentService.getStudentById(id));
        } catch (Exception e) {
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message",e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @PostMapping("/addStudent")
    public ResponseEntity <?> addStudent(@RequestBody Student student) {
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", studentService.addStudent(student));
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message",e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @PutMapping("/updateStudent")
    public ResponseEntity <?> updateStudent(@RequestBody Student student) {
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", studentService.updateStudent(student));
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message",e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity <?> deleteStudent(@PathVariable Integer id) {
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", studentService.deleteStudent(id));
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message",e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }
}
