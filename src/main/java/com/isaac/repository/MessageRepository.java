package com.isaac.repository;

import com.isaac.model.Message;

import java.util.List;

public interface MessageRepository {
    // Implement the methods to interact with the database

    // Method to get all messages
    public List<Message> getAllMessages();

    // Method to get a message by ID
    public Message getMessageById(int id);

    // Method to create a new message
    public Message createMessage(Message message);

    // Method to update a message
    public Message updateMessage(Message message);

    // Method to delete a message
    public void deleteMessage(int id);

    // Method to get all messages sent by a user
    public List<Message> getSentMessages(int userId);

    // Method to get all messages received by a user
    public List<Message> getReceivedMessages(int userId);

    // Method to mark a message as read
    public Message markMessageAsRead(int messageId);

    // Method to mark all messages as read
    public List<Message> markAllMessagesAsRead(int userId);

    // Method to get all unread messages
    public List<Message> getUnreadMessages(int userId);

    // Method to get all messages between two users
    public List<Message> getMessagesBetweenUsers(int user1Id, int user2Id);

    // Method to get all messages sent by a user to another user
    public List<Message> getMessagesSentByUserToUser(int fromUserId, int toUserId);

    // Method to get all messages received by a user from another user
    public List<Message> getMessagesReceivedByUserFromUser(int toUserId, int fromUserId);

    // Method to get all messages sent by a user to another user that are unread
    public List<Message> getUnreadMessagesSentByUserToUser(int fromUserId, int toUserId);

    // Method to get all messages received by a user from another user that are unread
    public List<Message> getUnreadMessagesReceivedByUserFromUser(int toUserId, int fromUserId);


}
