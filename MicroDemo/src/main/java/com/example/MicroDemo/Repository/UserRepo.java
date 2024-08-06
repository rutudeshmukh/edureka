package com.example.MicroDemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MicroDemo.Model.User;

public interface UserRepo extends MongoRepository<User,Integer>{

}
