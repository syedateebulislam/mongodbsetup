package com.mongodbtest.mongodb.service;



import com.mongodbtest.mongodb.entity.User;
import com.mongodbtest.mongodb.repo.MongoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    MongoUserRepository mongoUserRepository;
    public Optional<User> readUserById(int id) {
        return mongoUserRepository.findById(id);
    }

    public void addUser(User user) {
        mongoUserRepository.save(user);
    }

    public void removeUserById(int id) {
        mongoUserRepository.deleteById(id);
    }
}