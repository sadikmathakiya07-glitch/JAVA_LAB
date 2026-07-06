import java.util.Scanner;
class stirng{
    String new_String; 
    void setter(String s){
        new_String = s;
    }
    void getter(){
        int len=new_String.length();
        System.out.println("half of string is here : ");
        int halflen=len/2;
        String secondhalf=new_String.substring(halflen,len);
        System.out.println(secondhalf);
    }
}
public class strlen {
    public static void main(String[] args) {
        stirng s1=new stirng();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        s1.setter(sc.next());
        s1.getter();
    }
    
}
