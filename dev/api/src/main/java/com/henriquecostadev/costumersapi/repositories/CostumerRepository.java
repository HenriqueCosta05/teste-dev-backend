package com.henriquecostadev.costumersapi.repositories;

import com.henriquecostadev.costumersapi.models.Costumer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CostumerRepository extends MongoRepository<Costumer, Long> {
}
