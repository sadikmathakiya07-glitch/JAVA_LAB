import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class counter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fr = new FileInputStream("file.txt");
        int i = 0;
        int num_char = 0;
        int num_line = 0;
        int num_word = 0;
        while ((i = fr.read()) != -1) {
            if (i == '\n' || i == ' ') {
                num_word++;
            }
            if (i == '\n') {
                num_line++;
            }
            num_char++;
        }
        System.out.println("Charecter count is: " + num_char);
        System.out.println("word count is: " + num_word);
        System.out.println("line count is: " + num_line);

    }
}