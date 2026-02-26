import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
        System.out.println("enter c");
        c=sc.nextInt();
        if (a<b) {
            if (b<c) {
                System.out.println("largest : "+c);
            }else{
                System.out.println("largest : "+b);
            }
        }else{
            if (a<c) {
                System.out.println("largest : "+c);
            }else{
                System.out.println("largest : "+a);
            }
        }
    }

    }
