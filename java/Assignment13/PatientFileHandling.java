import java.io.*;
public class PatientFileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("patients.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) { out.write("1, Asha, 21, Fever\n2, Ravi, 35, Cold"); }
        try (BufferedReader in = new BufferedReader(new FileReader(file))) { String line; while ((line = in.readLine()) != null) System.out.println(line); }
    }
}
