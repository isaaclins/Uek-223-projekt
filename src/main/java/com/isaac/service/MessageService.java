package com.isaac.service;

public class MessageService {

    public void getAllMessages() {
        // Implement the logic to get all messages
    }

    public void getMessagesByUser() {
        // Implement the logic to get messages by user
    }

    public void sendMessageFromUserToUser() {
        // Implement the logic to send a message from one user to another
        // INSERT INTO messages (fromFKUID, toFKUID, messageText) VALUES (?, ?, ?);
    }

    public void readMessageFromUserToUser() {
        // Implement the logic to read a message from one user to another
        // SELECT * FROM messages WHERE fromFKUID = ? AND toFKUID = ?;
    }

    public void deleteMessageByMessageId() {
        // Implement the logic to delete a message by ID
    }

    public void deleteAllMessages() {

    }

    public void deleteAllMessagesFromUser() {

    }

    public void deleteAllMessagesToUser() {

    }
}
