package com.mongodbtest.mongodb.repo;


import com.mongodbtest.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserRepository extends MongoRepository<User, Integer> {
}