import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class digitcounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java digitcounter <filename>");
            return;
        }

        String filename = args[0];
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int character;

            while ((character = reader.read()) != -1) {
                if (character == '5') {
                    count++;
                }
            }

            reader.close();

            System.out.println("File: " + filename);
            System.out.println("Number of digit 5 occurrences: " + count);

        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be accessed!");
            System.out.println(e.getMessage());
        }
    }
}


 
