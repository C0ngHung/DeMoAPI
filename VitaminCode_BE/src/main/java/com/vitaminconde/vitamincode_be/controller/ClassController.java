package com.vitaminconde.vitamincode_be.controller;

import com.vitaminconde.vitamincode_be.mapper.ClassMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/class")
@RequiredArgsConstructor
public class ClassController {
    private final ClassMapper classMapper;

    @GetMapping("/getAllClass")
    public ResponseEntity<?> getllAllClass(){
//        return ResponseEntity.ok(classMapper.selectAllClass());
        Map<String, Object> resultMapAPI = new LinkedHashMap<>();
        try {
            resultMapAPI.put("status", 200);
            resultMapAPI.put("success", true);
            resultMapAPI.put("data", classMapper.selectAllClass());
        } catch (Exception e){
            resultMapAPI.put("status", 500);
            resultMapAPI.put("success",false);
            resultMapAPI.put("message", e.getMessage());
        }
        return ResponseEntity.ok(resultMapAPI);
    }
}
