import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
public class age {
    public static void main(String[] args)throws AgeException {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter your age : ");
        age=sc.nextInt();
        if(age<18){
            throw new AgeException("Invalid age for voter id");
            
        }
    }
}