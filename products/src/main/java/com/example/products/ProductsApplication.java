package com.example.products;

import com.example.products.entities.Students;
import com.example.products.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private StudentsRepository studentsRepository;

	public static void main(String[] args) {

		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//studentsRepository.save(new Students("Demba","Dieng",null,"INCG3"));
		//studentsRepository.save(new Students("Coumba","Kante",null,"INCG3"));
		//studentsRepository.save(new Students("Nasser","Diallo",null,"INCG3"));

		List<Students> ba = studentsRepository.findAll();
		System.out.println("***********************************");
		ba.forEach(students -> {
			System.out.println("Name : " +students.getFirstname()+"\n");
		});

		List<Students> s = studentsRepository.search("n");
		System.out.println("***********************************");
		s.forEach(students -> {
			System.out.println("Name : " +students.getFirstname()+"\n");
		});




	}
}
