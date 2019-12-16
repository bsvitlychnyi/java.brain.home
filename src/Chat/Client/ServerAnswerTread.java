package Chat.Client;

import Chat.ChatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerAnswerTread implements Runnable {
    private Socket socket;
    private BufferedReader bufferedReader;
    private ChatClient chatClient;

    public ServerAnswerTread(Socket socket, ChatClient chatClient) {
        try {
            this.chatClient = chatClient;
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String message = null;

        try {while (true){
            message = this.bufferedReader.readLine();
            chatClient.printMessageFromServer(message);
        }} catch (IOException e) {
            e.printStackTrace();
            chatClient.printMessageFromServer("Сервер впав");
        }
    }
}
