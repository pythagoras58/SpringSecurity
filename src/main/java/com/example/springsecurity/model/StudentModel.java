package com.example.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentModel {
    private Integer studentId;
    private String studentName;
}
