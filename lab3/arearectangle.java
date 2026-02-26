import java.util.Scanner;

public class arearectangle {
    public static void main(String[] args) {
        float l,b;
        System.out.println("enter length:");
        Scanner sc=new Scanner(System.in);
        l=sc.nextFloat();
        System.out.println("entet breadth:");
        b=sc.nextFloat();
        System.out.println("Area : "+(l*b));
    }
}
