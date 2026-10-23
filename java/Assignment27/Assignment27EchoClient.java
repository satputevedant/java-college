import java.io.*;
import java.net.*;
import java.util.*;

/** Assignment 27 client: sends a message to Assignment27EchoServer. */
public class Assignment27EchoClient {
    public static void main(String[] args) throws IOException {
        String message = args.length > 0 ? String.join(" ", args) : "Hello from client";

        try (Socket socket = new Socket("localhost", Assignment27EchoServer.PORT);
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            output.println(message);
            System.out.println(input.readLine());
        }
    }
}
