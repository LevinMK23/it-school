package com.samsung.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private final Socket socket;
    private DataInputStream is;
    private DataOutputStream os;

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        System.out.println("Client accepted.");
    }

    public void sendMessage(String msg) throws IOException {
        os.writeUTF(msg);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = is.readUTF();
                System.out.println("Received: " + msg);
                EchoServer.broadCast(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Client disconnected.");
            EchoServer.kick(this);
        }
    }
}
