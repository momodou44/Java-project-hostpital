package com.mamadou.students;

import com.mamadou.students.entities.Products;
import com.mamadou.students.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner
{
	@Autowired
	private ProductsRepository productsRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//productsRepository.save(new Products(null,3000.0,"Computer",4));
		//productsRepository.save(new Products(null,4000.0,"Printer",10));
		productsRepository.save(new Products(null,5000.0,"Smartphone",15));

		List<Products> productsList = productsRepository.findAll();
		productsList.forEach(p -> {
			System.out.printf("ID"+p.getId());
			System.out.printf("Name"+p.getName());
		});
	}
}
