import java.util.Scanner;

class counter {
    void vc(Scanner sc) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        while (true) {
            System.out.println("enter word : ");
            String s1 = sc.next();
            if (s1.equals("quit")) {
                break;
            }
            for (int z = 0; z < s1.length(); z++) {
                if (s1.charAt(z) == 'a') {
                    a++;

                }
                if (s1.charAt(z) == 'e') {
                    e++;

                }
                if (s1.charAt(z) == 'i') {
                    i++;

                }
                if (s1.charAt(z) == 'o') {
                    o++;

                }
                if (s1.charAt(z) == 'u') {
                    u++;

                }
            }
        }

        System.out.println("A=" + a);
        System.out.println("E=" + e);
        System.out.println("I=" + i);
        System.out.println("O=" + o);
        System.out.println("U=" + u);

    }
}

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        counter obj = new counter();
        obj.vc(sc);
    }
}
