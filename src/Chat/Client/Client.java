package Chat.Client;

import Chat.Server.ClientsThread;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    private Socket socket;
    private String username;

    public Client(String serverUrl, int port, String username) throws IOException {
        this.username = username;
        this.socket = new Socket(serverUrl, port);
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//        ServerAnswerTread serverAnswerTread = new ServerAnswerTread(socket);
//        new Thread(serverAnswerTread).start();
//
//        bufferedWriter.write(username + "\n");
//        bufferedWriter.flush();
    }

    public void SendMessage(String message) throws IOException {
        bufferedWriter.write(message + "\n");
        bufferedWriter.flush();
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
