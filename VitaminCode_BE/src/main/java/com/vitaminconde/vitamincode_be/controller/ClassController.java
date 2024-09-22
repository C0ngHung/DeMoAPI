package com.vitaminconde.vitamincode_be.controller;

import com.vitaminconde.vitamincode_be.entity.ClassA;
import com.vitaminconde.vitamincode_be.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/class")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @GetMapping("/getAllClass")
    public ResponseEntity<?> getllAllClass(){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();

        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.findAllClassA() );
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @GetMapping("/selectClassAById/{id}")
    public ResponseEntity<?> selectClassAById(@PathVariable("id") Integer classId){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.selectClassAById(classId) );
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @GetMapping("/getClass")
    public ResponseEntity <?> getClass(@RequestParam("id") Integer classId){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.selectClassAById(classId));
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @PostMapping("/createClass")
    public ResponseEntity<?> createClass(@RequestBody ClassA classA){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.insertClass(classA) );
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @DeleteMapping("/deleteClass/{id}")
    public ResponseEntity<?> deleteClass(@PathVariable("id") Integer classId){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.deleteClassA(classId) );
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }

    @PutMapping("/updateClass")
    public ResponseEntity<?> updateClass(@RequestBody ClassA classA){
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classService.updateClassA(classA) );
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }
}
