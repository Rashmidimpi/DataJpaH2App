package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.entity.Employee;
import com.mb.repo.EmpRepo;

@SpringBootApplication
public class DataJpaH2AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= SpringApplication.run(DataJpaH2AppApplication.class, args);
		
	EmpRepo bean	= context.getBean(EmpRepo.class);
	Employee emp = new Employee();
	emp.setEname("Rashmi");
	emp.setEsalary(1000.00);
	Employee save = bean.save(emp);
	System.out.println("Record saved");
	System.out.println(save);
	}

}
