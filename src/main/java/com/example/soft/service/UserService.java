package com.example.soft.service;

import com.example.soft.schemas.UserRequest;
import com.example.soft.store.User;
import com.example.soft.store.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User[] save(User user) {
        User userForDB = new User(user.getUsername(),user.getEmail(),user.getPassword_hash());
        userForDB =userRepository.save(userForDB);

        User[] response = new User[1];
        response[0] = userForDB;
        return response;
    }

    public User[] getAllUsers() {
        List<User> list = userRepository.findAll();
        User[] response = new User[list.size()];
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            response[i] = user;
        }
        return response;
    }
}
