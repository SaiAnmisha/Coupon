package com.capgemini.couponfinder.UserService.Repositoy;

import com.capgemini.couponfinder.UserService.Domain.UserDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepo extends MongoRepository<UserDAO, String> {
    UserDAO findByEmail(String email);
}
