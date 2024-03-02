import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileManager {

    public static void main(String[] args) {
        try {
            // Create a file
            createFile("example.txt");

            // Write content to the file
            writeToFile("example.txt", "Hello, this is a sample text!");

            // Read content from the file
            String content = readFromFile("example.txt");
            System.out.println("File content: " + content);

            // Delete the file
            deleteFile("example.txt");

            // Try to read content from a non-existent file
            String nonExistentContent = readFromFile("non_existent.txt");
            System.out.println("Content from non-existent file: " + nonExistentContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Create a file
    public static void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }

    // Write content to a file
    public static void writeToFile(String fileName, String content) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file.");
        }
    }

    // Read content from a file
    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            // Handle the case when the file is not found
            System.out.println("Error reading from the file: " + e.getMessage());
        }
        return content.toString();
    }
}
