package com.example.MongoSpringBoot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,String>{

}
