package me.dragan.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student("Mariam",
                    "mariem@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student alex = new Student("Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, JUNE, 15)
            );

            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
