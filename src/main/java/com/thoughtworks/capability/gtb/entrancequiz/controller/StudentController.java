package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.data.Data;
import com.thoughtworks.capability.gtb.entrancequiz.domian.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        return Data.getStudents();
    }
}
