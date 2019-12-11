package Chat.Client;

import Chat.Server.ClientsThread;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Никнейм";

        try (Socket socket = new Socket("127.0.0.1", 3001);
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            ServerAnswerTread serverAnswerTread = new ServerAnswerTread(socket);
            new Thread(serverAnswerTread).start();
            bufferedWriter.write(username+"\n");
            bufferedWriter.flush();
            while (true){
                String message = scanner.nextLine();
                bufferedWriter.write(message+"\n");
                bufferedWriter.flush();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
