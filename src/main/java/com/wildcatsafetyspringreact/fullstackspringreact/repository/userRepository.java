package com.wildcatsafetyspringreact.fullstackspringreact.repository;


import com.wildcatsafetyspringreact.fullstackspringreact.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<users, String> {
    users findBy_id(String _id);
}
