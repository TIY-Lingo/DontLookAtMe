package com.theironyard.services;


import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
//    public User findFirstByName(String name);

}
