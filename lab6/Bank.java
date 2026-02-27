    import java.util.Scanner;

    class Bankdemo {

        String acc_Type;
        int acc_no;
        double Balance;

        public void setter(String n, int r, double s) {
            acc_Type = n;
            acc_no = r;
            Balance = s;

        }

        public void getter() {
            System.out.println(acc_Type + " | " + acc_no + " | " + Balance + " | ");
        }

    }

    public class Bank {
        public static void main(String[] args) {

            Bankdemo s1 = new Bankdemo();
            Bankdemo s2 = new Bankdemo();
            Bankdemo s3 = new Bankdemo();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter details for Student 1 (acc type acc_no Balance ):");
            s1.setter(sc.next(), sc.nextInt(), sc.nextDouble());
            System.out.println("Enter details for Student 2 (acc type acc_no Balance ):");
            s2.setter(sc.next(), sc.nextInt(), sc.nextDouble());
            System.out.println("Enter details for Student 3 (acc type acc_no Balance ):");
            s3.setter(sc.next(), sc.nextInt(), sc.nextDouble());

            System.out.println("--- Student Details ---");
            s1.getter();
            s2.getter();
            s3.getter();
        }

    
    }
