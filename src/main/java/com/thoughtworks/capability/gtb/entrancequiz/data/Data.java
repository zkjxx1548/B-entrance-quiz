package com.thoughtworks.capability.gtb.entrancequiz.data;

import com.thoughtworks.capability.gtb.entrancequiz.domian.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Data {
    private static List<Student> students;

    public static void initData() {
        students = new ArrayList<>();
        String[] studentNames = new String[]{
                "成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰",
                "雅典娜", "芈月", "白起", "刘禅", "庄周",
                "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
        for (int i=0; i < studentNames.length; i++) {
            Student student = new Student((i+1), studentNames[i]);
            students.add(student);
        }
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        Data.students = students;
    }
}
