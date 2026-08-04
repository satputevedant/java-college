import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** Demonstrates basic file handling for patient records. */
public class PatientFileHandling {
    private static final File FILE = new File("patients.txt");

    public static void main(String[] args) {
        createFile();
        showFileInformation();
        writeFile();
        readFile();
        appendToFile();
        readFile();

        deleteFile();
    }

    private static void createFile() {
        try {
            if (FILE.createNewFile()) {
                System.out.println("File " + FILE.getName() + " was created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("Unable to create the file: " + exception.getMessage());
        }
    }

    private static void showFileInformation() {
        if (!FILE.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        System.out.println("File name: " + FILE.getName());
        System.out.println("Absolute path: " + FILE.getAbsolutePath());
        System.out.println("Can write: " + FILE.canWrite());
        System.out.println("Can read: " + FILE.canRead());
        System.out.println("Size in bytes: " + FILE.length());
    }

    private static void writeFile() {
        try (FileWriter writer = new FileWriter(FILE)) {
            writer.write("1, Asha, 21, Fever\n");
            writer.write("2, Ravi, 35, Cold");
            System.out.println("Patient records were written successfully.");
        } catch (IOException exception) {
            System.out.println("Unable to write to the file: " + exception.getMessage());
        }
    }

    private static void readFile() {
        try (Scanner reader = new Scanner(FILE)) {
            System.out.println("Patient records:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Unable to read the file: " + exception.getMessage());
        }
    }

    private static void appendToFile() {
        try (FileWriter writer = new FileWriter(FILE, true)) {
            writer.write("\n3, Meera, 29, Headache");
            System.out.println("A patient record was appended successfully.");
        } catch (IOException exception) {
            System.out.println("Unable to append to the file: " + exception.getMessage());
        }
    }

    private static void deleteFile() {
        if (FILE.delete()) {
            System.out.println(FILE.getName() + " was deleted successfully.");
        } else {
            System.out.println("Unable to delete the file.");
        }
    }
}
