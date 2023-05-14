package com.example.demo;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TaskManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		EmployeeEntity employee1 = EmployeeEntity.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.email("ramesh@gmail.com")
				.build();

		EmployeeEntity employee2 = EmployeeEntity.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("tony@gmail.com")
				.build();

		EmployeeEntity employee3 = EmployeeEntity.builder()
				.firstName("John")
				.lastName("Cena")
				.email("cena@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
