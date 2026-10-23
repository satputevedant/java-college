import java.io.*;
import java.net.*;

/** Assignment 27 alternative exercise: simple one-client line chat client. */
public class Assignment27ChatClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5001);
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(
                     new InputStreamReader(System.in))) {

            while (true) {
                System.out.print("Client: ");
                String message = console.readLine();
                output.println(message);

                if ("bye".equalsIgnoreCase(message)) {
                    break;
                }

                String reply = input.readLine();
                System.out.println("Server: " + reply);

                if ("bye".equalsIgnoreCase(reply)) {
                    break;
                }
            }
        }
    }
}
