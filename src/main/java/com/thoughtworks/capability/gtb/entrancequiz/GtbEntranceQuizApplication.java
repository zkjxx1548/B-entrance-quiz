package com.thoughtworks.capability.gtb.entrancequiz;

import com.thoughtworks.capability.gtb.entrancequiz.data.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
		Data.initData();
		System.out.print(Data.getStudents().toString());
	}

}
