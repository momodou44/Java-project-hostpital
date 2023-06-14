package com.mamadou.hospital;

import com.mamadou.hospital.entities.Patient;
import com.mamadou.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class HospitalApplication implements CommandLineRunner
{
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		patientRepository.save(new Patient(null,"Naruto",new Date(),false,35));
		patientRepository.save(new Patient(null,"Hamady",new Date(),true,50));
		patientRepository.save(new Patient(null,"Amadou",new Date(),false,45));
		patientRepository.save(new Patient(null,"Souleimane",new Date(),true,75));
		patientRepository.save(new Patient(null,"Samba",new Date(),false,85));

	}
}
