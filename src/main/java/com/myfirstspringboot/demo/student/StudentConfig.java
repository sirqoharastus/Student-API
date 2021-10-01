package com.myfirstspringboot.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student abdulqohar = new Student("Abdulqohar", "sabdulqohar9@gmail.com", LocalDate.of(1994, Month.APRIL, 27));
           Student ali = new Student("Ali", "aliebiraville@gmail.com", LocalDate.of(1988, Month.APRIL, 16));
           studentRepository.saveAll(List.of(abdulqohar, ali));
        };
    }
}
