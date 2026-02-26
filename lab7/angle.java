import java.util.Scanner;

class hourminite {
    void find(double h, double m, double angle) {
        angle = Math.abs(h * 30 + m * 0.5 - m * 6);
        System.out.println("Angle = " + angle);
    }

}

public class angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour:");
        double h = sc.nextDouble();
        System.out.print("Enter minute:");
        double m = sc.nextDouble();
        hourminite obj = new hourminite();
        obj.find(h, m, m);
    }

}