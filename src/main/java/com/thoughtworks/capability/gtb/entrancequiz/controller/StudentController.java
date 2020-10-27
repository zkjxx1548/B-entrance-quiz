package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.data.Data;
import com.thoughtworks.capability.gtb.entrancequiz.domian.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
    @GetMapping("/get/students")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(Data.getStudents());
    }

    @PostMapping("/add/student")
    public String addStudent(@RequestBody String name) {
        List<Student> students = Data.getStudents();
        students.add(new Student(students.size() + 1, name));
        Data.setStudents(students);
        System.out.println(Data.getStudents());
        return "success";
    }
}
