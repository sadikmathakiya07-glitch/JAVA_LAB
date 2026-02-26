import java.util.Scanner;

public class maxx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int n1=sc.nextInt();
          System.out.println("enter second number :");
          int n2=sc.nextInt();
            System.out.println("enter third number :");
            int n3=sc.nextInt();
            maxx obj=new maxx();
            obj.check(n1,n2,n3);
    }
    void check(int n1,int n2,int n3){
        int max;
        max = n1<n2?(n2<n3?n3:n2):(n1<n3?n3:n1);
        System.out.println("maximum number is "+max);
    }
}
