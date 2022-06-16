package com.example.demo.student;

import static java.util.Calendar.JANUARY;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "m.j@test.com",
                    LocalDate.of(2000, JANUARY+1, 5));

            Student alex = new Student(
                    "Alex",
                    "a.g@test.com",
                    LocalDate.of(2004, JANUARY+1, 5));

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
