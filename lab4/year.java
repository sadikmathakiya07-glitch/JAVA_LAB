import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year :");
        int y=sc.nextInt();
        year obj=new year();
        obj.leapcheck(y);
    }
    void leapcheck(int x){
        if ((x%4==0 & x%100!=0)| x%400==0 ) {
            System.out.println("--->this year is leap year<---");
        }else{
             System.out.println("--->this year is non leap year<---");
        }
    }
}
