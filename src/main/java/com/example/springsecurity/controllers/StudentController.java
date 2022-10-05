package com.example.springsecurity.controllers;

import com.example.springsecurity.model.StudentModel;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
//@CrossOrigin("http:localhost:8099")
@RequestMapping("api/v1/students")
public class StudentController {

    //get some student list
    private static final List<StudentModel> STUDENT_MODEL_LIST= Arrays.asList(
            new StudentModel(1, "Solomon"),
            new StudentModel(2, "Abena"),
            new StudentModel(3, "Prince")
    );




//    @CrossOrigin("http:localhost:8099")
    @GetMapping(path = "{studentId}")
    public StudentModel getStudent(@PathVariable("studentId") Integer studentId){
        return STUDENT_MODEL_LIST.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Student" + studentId + "Not Found"));
    }
}
