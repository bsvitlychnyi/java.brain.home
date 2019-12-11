package Chat.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerAnswerTread implements Runnable {
    private Socket socket;
    private BufferedReader bufferedReader;

    public ServerAnswerTread(Socket socket) {
        try {
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
            System.out.println(message);
        }} catch (IOException e) {
            e.printStackTrace();
            System.out.println("Сервер впав");
        }
    }
}
