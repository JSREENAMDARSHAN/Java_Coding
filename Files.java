import java.io.*;
import java.util.*;
public class Files {
    public static void main(String[] args) {
        // Use a consistent path. Note: Use double backslashes or a single forward slash.
        File file = new File("C:\\Users\\2369973\\OneDrive - Cognizant\\Desktop\\practice\\testfilesample.txt"); 

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // PASS THE FILE OBJECT HERE
            FileWriter filewriter = new FileWriter(file); 
            filewriter.write("Hi hello welcome");
            filewriter.close(); // Crucial: This flushes the data to the disk
            
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    File obj = new File("C:\\Users\\2369973\\OneDrive - Cognizant\\Desktop\\practice\\testfilesample.txt");
        try (Scanner myReader = new Scanner(obj)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    }
}