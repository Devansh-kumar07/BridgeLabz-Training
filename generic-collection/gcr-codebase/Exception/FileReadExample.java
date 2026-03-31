import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReadExample {
    public static void main(String args) {
        String filePath = "data.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }

           try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File exists. Printing contents:");
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}