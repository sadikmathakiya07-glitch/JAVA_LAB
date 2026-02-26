import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        float f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temprature in fahrenheit:");
        f=sc.nextFloat();
        c=((f-32)*5/9);
        System.out.println("celsius : "+c);
    }
}
