package com.wildcatsafetyspringreact.fullstackspringreact.repository;


import com.wildcatsafetyspringreact.fullstackspringreact.models.Observable;
import com.wildcatsafetyspringreact.fullstackspringreact.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ObservableRepository extends MongoRepository<User, String> {
    Optional<Observable> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
