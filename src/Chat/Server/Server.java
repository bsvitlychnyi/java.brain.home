package Chat.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Server {

    public ArrayList<ClientsThread> clientsList = new ArrayList<>();

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(3001)){
            while (true){
                Socket socket = serverSocket.accept();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String username = bufferedReader.readLine();
                ClientsThread client = new ClientsThread(socket, username, this);
                clientsList.add(client);
                new Thread(client).start();
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сервер вмер...");
    }

    public void SendMessages(String messageFromClient){
        for (ClientsThread client: clientsList) {
            client.sendMessage(messageFromClient);
        }
    }
}