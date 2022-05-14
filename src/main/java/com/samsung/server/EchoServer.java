package com.samsung.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public class EchoServer {

    private static final ConcurrentLinkedQueue<ClientHandler> clients = new ConcurrentLinkedQueue<>();

    public static void kick(ClientHandler client) {
        clients.remove(client);
    }
    public static void broadCast(String msg) throws IOException {
        for (ClientHandler client : clients) {
            client.sendMessage(msg);
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189);
        while (true) {
            ClientHandler client = new ClientHandler(server.accept());
            clients.add(client);
            new Thread(client).start();
        }
    }
}
