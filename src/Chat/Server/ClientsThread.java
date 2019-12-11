package Chat.Server;

import java.io.*;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ClientsThread implements Runnable {
    private Socket soket;
    private String username;
    private Server server;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public ClientsThread(Socket soket, String username, Server server) throws IOException {
        this.soket = soket;
        this.username = username;
        this.server = server;
        this.bufferedReader = new BufferedReader(new InputStreamReader(soket.getInputStream()));
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(soket.getOutputStream()));
    }

    @Override
    public void run() {
        try {

            System.out.println(this.username+" подключился к чату");
            this.server.SendMessages(this.username+" подключился к чату\n");
            log(this.username+" подключился к чату");

            while (true) {
                String messageFromClient = bufferedReader.readLine();
                Calendar calendar = Calendar.getInstance();
                String time = calendar.getTime().getHours()+":"+calendar.getTime().getMinutes()+":"+calendar.getTime().getSeconds()+"("+this.username+"): ";
                System.out.println(time + messageFromClient);
                log(this.soket.getRemoteSocketAddress()+" "+time + messageFromClient);
                this.server.SendMessages(time + messageFromClient + "\n");
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void log(String record){
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream("files/log.txt", true))) {
            printWriter.println(record);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message){
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
