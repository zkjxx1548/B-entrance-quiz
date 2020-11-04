package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.data.Data;
import com.thoughtworks.capability.gtb.entrancequiz.domian.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO GTB-完成度: * 只有查询学员和增加学员的API

//TODO GTB-测试: * 没有测试

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
    //TODO GTB-知识点: - URL 不符合 REST 规范哈
    @GetMapping("/get/students")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(Data.getStudents());
    }

    @PostMapping("/add/student")
    public String addStudent(@RequestBody String name) {
        //TODO GTB-工程实践: - 这些实现细节不应该写到 controller 里，不是 controller 的职责，应该放到 service 里去
        List<Student> students = Data.getStudents();
        students.add(new Student(students.size() + 1, name));
        Data.setStudents(students);
        //TODO GTB-工程实践: - 不要有 print 语句留下
        System.out.println(Data.getStudents());
        //TODO GTB-知识点: - 返回 status code，而不是字符串，了解一下 @ResponseStatus
        return "success";
    }
}
