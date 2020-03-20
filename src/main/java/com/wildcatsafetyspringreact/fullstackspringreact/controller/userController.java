package com.wildcatsafetyspringreact.fullstackspringreact.controller;


import com.wildcatsafetyspringreact.fullstackspringreact.model.users;
import com.wildcatsafetyspringreact.fullstackspringreact.repository.userRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/")
public class userController {

    @Autowired
    private userRepository repository;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<users> getAllUsers() {
        return repository.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public users getListingsById(@PathVariable("id") String id) {
        return repository.findBy_id(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyListingsById(@PathVariable("id") String id,
                                   @Valid @RequestBody users users) {
        users.set_id(id);
        repository.save(users);
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public users createList(@Valid @RequestBody users users) {
        users.set_id(ObjectId.get().toHexString());
        repository.save(users);
        return users;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteListing(@PathVariable String id) {
        repository.delete(repository.findBy_id(id));
    }
}
