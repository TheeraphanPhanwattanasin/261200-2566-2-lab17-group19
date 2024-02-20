package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    public static int counter=0;
    @Setter
    private int ppl;
}