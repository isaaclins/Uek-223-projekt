package com.isaac.service;

public class MessageService {
    // Implement the methods to interact with the Message entity
    // Use the MessageDAO class to interact
    // Implement the logic to create, read, update, and delete messages
    // Implement the logic to get all messages
    // Implement the logic to get a message by ID
    // Implement the logic to get messages by user
    // Implement the logic to send a message from one user to another
    // Implement the logic to read a message from one user to another
    // Implement the logic to delete a message by ID
    // Implement the logic to delete all messages
    // Implement the logic to delete all messages from a user
    // Implement the logic to delete all messages to a user
    // Implement the logic to execute a query
    

    public Boolean executeQuery() {
        // Implement the logic to execute a query
        return true;
    }

    public void getMessageByMessageId(int id) {
        // Implement the logic to get a message by ID
        // SELECT * FROM messages WHERE id = ?;
    }
    public void getAllMessages() {
        // Implement the logic to get all messages
        // SELECT * FROM messages;
    }

    public void getMessagesSentByUserId( int FKUID) {
        // Implement the logic to get messages by user
        // SELECT * FROM messages WHERE fromFKUID = ?;
    }

    public void sendMessageFromUserToUser(int fromFKUID, int toFKUID, String messageText) {
        // Implement the logic to send a message from one user to another
        // INSERT INTO messages (fromFKUID, toFKUID, messageText) VALUES (?, ?, ?);
    }

    public void readMessageFromUserToUser(int fromFKUID, int toFKUID) {
        // Implement the logic to read a message from one user to another
        // SELECT * FROM messages WHERE fromFKUID = ? AND toFKUID = ?;
    }

    public void deleteMessageByMessageId(int id) {
        // Implement the logic to delete a message by ID
        // DELETE FROM messages WHERE id = ?;
    }

    public void deleteAllMessages() {
        // Implement the logic to delete all messages
        // DELETE FROM messages;
    }

    public void deleteAllMessagesFromUser(int FKUID) {
        // Implement the logic to delete all messages from a user
        // DELETE FROM messages WHERE fromFKUID = ?;
    }

    public void deleteAllMessagesToUser(int FKUID) {
        // Implement the logic to delete all messages to a user
        // DELETE FROM messages WHERE toFKUID = ?;

    }
}
