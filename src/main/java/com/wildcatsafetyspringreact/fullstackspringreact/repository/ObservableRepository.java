package com.wildcatsafetyspringreact.fullstackspringreact.repository;


import com.wildcatsafetyspringreact.fullstackspringreact.models.Observable;
import com.wildcatsafetyspringreact.fullstackspringreact.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ObservableRepository extends MongoRepository<Observable, String> {
    Optional<Observable> findBySubmittedBy(String submittedBy);

    Boolean existsBySubmittedBy(String submittedBy);
}
