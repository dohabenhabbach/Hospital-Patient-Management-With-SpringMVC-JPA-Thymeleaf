package com.example.mvc;

import com.example.mvc.entities.Patient1;
import com.example.mvc.repository.PatientRe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRe patientRepository ;



    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient1(null, "doha", new Date(), true, 88));
        patientRepository.save(new Patient1(null, "zayd", new Date(), false, 8));
        patientRepository.save(new Patient1(null, "saad", new Date(), false, 98));
    }}
