import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=sc.nextInt();
        palindrome obj=new palindrome();
        obj.check(n);
    }
    void check(int n1){
        int n2;
        
        int c=1;
        int rem[] = null;
        for(int i=0;n1!=0;i++){
            rem[i]=n1%10;
            n1=n1/10;
            c++;
        }
        
        
    }
}
