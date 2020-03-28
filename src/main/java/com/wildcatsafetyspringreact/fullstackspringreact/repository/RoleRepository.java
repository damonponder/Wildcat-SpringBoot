package com.wildcatsafetyspringreact.fullstackspringreact.repository;

import com.wildcatsafetyspringreact.fullstackspringreact.models.ERole;
import com.wildcatsafetyspringreact.fullstackspringreact.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
        Optional<Role> findByName(ERole name);
}
