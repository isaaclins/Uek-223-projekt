package com.isaac.repository;


import com.isaac.model.User;

import java.util.List;

public interface UserRepository {

    // Method to get all users
    public List<User> getAllUsers();

    // Method to get a user by ID
    public User getUserById(int id);

    // Method to create a new user
    public User createUser(User user);

    // Method to update a user
    public User updateUser(User user);

    // Method to delete a user
    public void deleteUser(int id);

    // Method to check if a user exists
    public boolean userExists(int id);

    // Method to check if a username is taken
    public boolean usernameTaken(String username);

    // Method to check if an email is taken
    public boolean emailTaken(String email);

    // Method to get a user by username
    public User getUserByUsername(String username);

    // Method to get a user by email
    public User getUserByEmail(String email);

}
