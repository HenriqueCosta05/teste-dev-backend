package com.henriquecostadev.costumersapi.repositories;

import com.henriquecostadev.costumersapi.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, Long> {
}
