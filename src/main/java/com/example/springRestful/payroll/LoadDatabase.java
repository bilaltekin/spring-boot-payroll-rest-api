package com.example.springRestful.payroll;

import com.example.springRestful.payroll.model.Employee;
import com.example.springRestful.payroll.model.Status;
import com.example.springRestful.payroll.repository.EmployeeRepository;
import com.example.springRestful.payroll.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("ahmet", "burglar")));
            log.info("Preloading " + repository.save(new Employee("mehmet", "thief")));
            log.info("Preloading " + repository.save(new Employee("tekin", "burglar")));



        };
    }
}
