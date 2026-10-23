import java.io.*;
import java.net.*;

/** Assignment 27 server: echoes one client message. Run before Assignment27EchoClient. */
public class Assignment27EchoServer {
    public static final int PORT = 5000;

    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Echo server listening on " + PORT);

            try (Socket socket = server.accept();
                 BufferedReader input = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                 PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

                String message = input.readLine();
                output.println("Server echo: " + message);
                System.out.println("Received: " + message);
            }
        }
    }
}
