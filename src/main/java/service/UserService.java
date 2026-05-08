package com.lokesh.creditscore.service;

import com.lokesh.creditscore.entity.User;
import com.lokesh.creditscore.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User updatedUser) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setName(updatedUser.getName());
        existingUser.setCreditScore(updatedUser.getCreditScore());

        return userRepository.save(existingUser);
    }
    public String deleteUser(Long id) {

        userRepository.deleteById(id);

        return "User deleted successfully";
    }
}