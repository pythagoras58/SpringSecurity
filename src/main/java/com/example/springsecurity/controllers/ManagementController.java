package com.example.springsecurity.controllers;

import com.example.springsecurity.model.StudentModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public void registerNewStudent(StudentModel studentModel){
        log.info("[STUDENT INSERTED]-->{}", studentModel);
    }

    public void deleteStudent(Integer studentID){
        log.info("[STUDENT DELETE]-->{}", studentID);
    }

    public void updateStudent(Integer studentID, StudentModel studentModel){
        log.info("[STUDENT UPDATED]-->{} --> {}", studentID, studentModel);
    }
}
