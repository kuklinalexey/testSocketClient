import MultipleClient.MultipleClient;

import java.io.*;
import java.net.Socket;

public class Main {

    public static final int MAX_THREAD_COUNT = 20;

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < MAX_THREAD_COUNT; i++) {
            new MultipleClient();
        }
    }
}
