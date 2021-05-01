package com.lior.AdoptMe.service;

import com.lior.AdoptMe.entitiy.User;
import com.lior.AdoptMe.exception.UserNotFoundException;
import com.lior.AdoptMe.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUserRepo userRepo;

    @Autowired
    public UserService(IUserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public User findUserByEmail(String email) {
        return userRepo.findUserByEmail(email).orElseThrow(() -> new UserNotFoundException("User by email " + email + " not found"));
    }
}
