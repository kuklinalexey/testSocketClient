package MultipleClient;

import java.io.*;
import java.net.Socket;

public class MultipleClient extends Thread {

    public static final String SERVER_ADDRESS = "localhost";
    public static final int SERVER_PORT = 8080;

    private Socket socket;
    private PrintWriter out;

    public MultipleClient() {
        try {
            this.socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        } catch (IOException e) {
            e.printStackTrace();
        }

        this.start();
    }

    @Override
    public void run() {
        out.println(Thread.currentThread().getName() + " Hello!");

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
