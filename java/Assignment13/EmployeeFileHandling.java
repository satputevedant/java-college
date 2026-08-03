import java.io.*;
public class EmployeeFileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("employees.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) { out.write("1001, Asha, Developer\n1002, Ravi, Tester"); }
        try (BufferedReader in = new BufferedReader(new FileReader(file))) { String line; while ((line = in.readLine()) != null) System.out.println(line); }
    }
}
