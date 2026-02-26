import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number :");
        int n=sc.nextInt();
        oddeven obj=new oddeven();
        obj.check(n);
    }
    void check(int n){
        if (n%2==0) {
            System.out.println("---->number is even<----");
        }else{
            System.out.println("---->number is odd<----");
        }
    }
}
