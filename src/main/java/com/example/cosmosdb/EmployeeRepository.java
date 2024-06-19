package com.example.cosmosdb;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends ReactiveCosmosRepository<Employee, String> {
    Flux<Employee> findByFname(String fname);
}
