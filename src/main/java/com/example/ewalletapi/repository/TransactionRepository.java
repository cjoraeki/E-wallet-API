package com.example.ewalletapi.repository;

import com.example.ewalletapi.model.Transactions;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transactions, String> {
    boolean existsByReferenceOrId(String reference, String id);
}
