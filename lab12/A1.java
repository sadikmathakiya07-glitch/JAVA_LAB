
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a is Number: ");
        int a = sc.nextInt();
        System.out.print("Enter b is Number: ");
        int b = sc.nextInt();
        try {
            int ans = a / b;
            System.out.print("Answer is: " + ans);
        } catch (Exception e) {
            System.out.print("Excestion is: " + e.toString());
        }

        int z[] = {1,2,3,4};
        try {
            System.out.print(z[5]);
        } catch (Exception e) {
            System.out.print(e.toString());
        }

    }
}