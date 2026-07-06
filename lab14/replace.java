import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class replace {
    public static void main(String[] args) throws IOException {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String word1 = "word1";
        String word2 = "word2";

        int replacementCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

            String line;

            while ((line = reader.readLine()) != null) {
                int count = countOccurrences(line, word1);
                replacementCount += count;

                String replacedLine = line.replaceAll(word1, word2);

                writer.write(replacedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Replacement completed!");
            System.out.println("Number of replacements: " + replacementCount);
            System.out.println("Output written to: " + file2);

        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be accessed!");
            System.out.println(e.getMessage());
        }
    }

    public static int countOccurrences(String text, String word) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}
