import java.util.Scanner;

class radius {
    double area;

    void area(double r) {
        area = 3.14 * r * r;
        System.out.println("Area = " + area);
    }

}

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Radius For Area:");
        double r = sc.nextDouble();
        radius obj = new radius();
        obj.area(r);
    }
}
