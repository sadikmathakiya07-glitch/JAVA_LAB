

import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int s = sc.nextInt();
        int ar[] = new int[s];
        ArrayReverse obj = new ArrayReverse();
        obj.reverseArray(ar);
    }

    void reverseArray(int ar[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter a[" + i + "]: ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }
}