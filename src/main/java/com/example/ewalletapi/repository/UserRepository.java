package com.example.ewalletapi.repository;

import com.example.ewalletapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String username);

    boolean existsByEmail(String email);
}
