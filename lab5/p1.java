public class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        System.out.println("Pattern:");

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
