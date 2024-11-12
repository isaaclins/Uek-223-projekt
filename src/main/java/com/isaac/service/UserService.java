package com.isaac.service;

public class UserService {
    // Implement the methods to interact with the User entity
    // Use the UserDAO class to interact with the database
    // Implement the logic to create, read, update, and delete users
    // Implement the logic to get all users
    // Implement the logic to get a user by ID
    // Implement the logic to get a user by username
    // Implement the logic to update a user by ID
    // Implement the logic to delete a user by ID
    // Implement the logic to execute a query

    public Boolean executeQuery() {
        // Implement the logic to execute a query
        return true;
    }
    public void createUser() {
        // Implement the logic to create a new user
        // INSERT INTO users (username, password, email) VALUES (?, ?, ?);
    }

    public void updateUserById(int id) {
        // Implement the logic to update a user
        // UPDATE users SET username = ?, password = ?, email = ? WHERE id = ?;
    }

    public void deleteUserById(int id) {
        // Implement the logic to delete a user
        // DELETE FROM users WHERE id = ?;
    }

    public void getUserById(int id) {
        // Implement the logic to get a user by ID
        // SELECT * FROM users WHERE id = ?;
    }

    public void getUserByUsername(String username) {
        // Implement the logic to get a user by username
        // SELECT * FROM users WHERE username = ?;
    }

    public void getAllUsers() {
        // Implement the logic to get all users
        // SELECT * FROM users;
    }



}
