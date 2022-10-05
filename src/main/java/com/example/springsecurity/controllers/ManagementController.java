package com.example.springsecurity.controllers;

import com.example.springsecurity.model.StudentModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
@Slf4j
public class ManagementController {
    //get some student list
    private static final List<StudentModel> STUDENT_MODEL_LIST= Arrays.asList(
            new StudentModel(1, "Solomon"),
            new StudentModel(2, "Abena"),
            new StudentModel(3, "Prince")
    );

    public List<StudentModel> getAllStudents(){
        return STUDENT_MODEL_LIST;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody StudentModel studentModel){
        log.info("[STUDENT INSERTED]-->{}", studentModel);
    }

    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Integer studentID){
        log.info("[STUDENT DELETE]-->{}", studentID);
    }

    @PutMapping(path = "{studentID}")
    public void updateStudent(@PathVariable("studentID") Integer studentID,@RequestBody StudentModel studentModel){
        log.info("[STUDENT UPDATED]-->{} --> {}", studentID, studentModel);
    }
}
