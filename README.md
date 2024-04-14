# FileManager

## Description

A simple Java class for file management operations including creating, writing, reading, and deleting files.

## Usage

1. **Creating a File**:
   - Use the `createFile(String fileName)` method to create a new file with the specified file name.

   ```java
   createFile("example.txt");
   
## Writing Content to a File:

1. Use the writeToFile(String fileName, String content) method to write content to a file.
```Java
writeToFile("example.txt", "Hello, this is a sample text! 😀");
```
2. Reading Content from a File:

Use the readFromFile(String fileName) method to read content from a file.
```Java
String content = readFromFile("example.txt");
System.out.println("File content: " + content);
```
3. Deleting a File:

Use the deleteFile(String fileName) method to delete a file.
```Java
deleteFile("example.txt");
```
## Example
```Java
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a file
            FileManager.createFile("example.txt");

            // Write content to the file
            FileManager.writeToFile("example.txt", "Hello, this is a sample text! 😀");

            // Read content from the file
            String content = FileManager.readFromFile("example.txt");
            System.out.println("File content: " + content);

            // Delete the file
            FileManager.deleteFile("example.txt");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
```
## License

This project is licensed under the MIT License - see the LICENSE file for details.
