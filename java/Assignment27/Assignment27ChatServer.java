import java.io.*;
import java.net.*;

/** Assignment 27 alternative exercise: simple one-client line chat server. */
public class Assignment27ChatServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5001);
             Socket socket = server.accept();
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(
                     new InputStreamReader(System.in))) {

            System.out.println("Client connected. Type messages; 'bye' ends chat.");
            String fromClient;

            while ((fromClient = input.readLine()) != null) {
                System.out.println("Client: " + fromClient);

                if ("bye".equalsIgnoreCase(fromClient)) {
                    break;
                }

                System.out.print("Server: ");
                String reply = console.readLine();
                output.println(reply);

                if ("bye".equalsIgnoreCase(reply)) {
                    break;
                }
            }
        }
    }
}
