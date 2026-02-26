import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    double SPI;
    String course;

    public void setter(String n, int r, double s, String c) {
        name = n;
        roll_no = r;
        SPI = s;
        course = c;
    }

    public void getter() {
        System.out.println(name + " | " + roll_no + " | " + SPI + " | " + course);
    }

}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Student 1 (name roll_no SPI course):");
        s1.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        System.out.println("Enter details for Student 2 (name roll_no SPI course):");
        s2.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        System.out.println("Enter details for Student 3 (name roll_no SPI course):");
        s3.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());

        System.out.println("--- Student Details ---");
        s1.getter();
        s2.getter();
        s3.getter();
    }
}