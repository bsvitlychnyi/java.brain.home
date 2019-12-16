package Chat;

import Chat.Client.Client;
import Chat.Client.ServerAnswerTread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ChatClient extends JFrame {
    private JPanel panel1;
    private JButton sendMessageBtn;
    private JTextField messageTextField;
    private JTextArea chatTextArea;
    private JButton startClientBtn;
    private JTextField serverUrlTextField;
    private JTextField portTextField;
    private JTextField usernameTextField;
    private JLabel username;
    private JLabel port;
    private JLabel serverUrl;
    private Client client;
    private ServerAnswerTread serverAnswerTread;
    private ChatClient chatClient = this;

    ChatClient() {
        super("Чат");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setVisible(true);
        initListeners();
    }

    private void initListeners() {
        initSendBtnListeners();
        initStartBtnListeners();
    }

    private void initSendBtnListeners() {
        sendMessageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    getClient().SendMessage(messageTextField.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                messageTextField.selectAll();
                messageTextField.replaceSelection("");
            }
        });
    }

    private void initStartBtnListeners() {
        startClientBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setClient(new Client(serverUrlTextField.getText(), Integer.parseInt(portTextField.getText()), usernameTextField.getText()));
                    setServerAnswerTread(new ServerAnswerTread(getClient().getSocket(), getChatClient()));
                    new Thread(serverAnswerTread).start();
                    getClient().SendMessage(getClient().getUsername());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void printMessageFromServer(String message) {
        chatTextArea.append(message+"\n");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ServerAnswerTread getServerAnswerTread() {
        return serverAnswerTread;
    }

    public void setServerAnswerTread(ServerAnswerTread serverAnswerTread) {
        this.serverAnswerTread = serverAnswerTread;
    }

    public ChatClient getChatClient() {
        return chatClient;
    }

    public void setChatClient(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public static void main(String[] args) {
        ChatClient window = new ChatClient();
    }

}
