package com.grundfos.wiki.service;

import com.grundfos.wiki.websocket.WebSocketServer;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WebsocketService {
    @Resource
    public WebSocketServer webSocketServer;

    @Async
    public void sendInfo(String message) {
        webSocketServer.sendInfo(message);
    }
}
