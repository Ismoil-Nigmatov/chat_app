package com.example.chat_app.entity;

import lombok.Data;

/**
 * @author "ISMOIL NIGMATOV"
 * @created 12:20 PM on 10/6/2022
 * @project WebSocketChat
 */

@Data
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
