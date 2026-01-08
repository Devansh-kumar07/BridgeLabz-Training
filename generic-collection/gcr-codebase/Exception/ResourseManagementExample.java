import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementExample {
    public static void main(String args) {
        String filePath = "info.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine();
            System.out.println("First line of the file: " + firstLine);
        } catch (IOException e) {
             System.out.println("Error reading file");
        }
    }
}