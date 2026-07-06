import java.util.Scanner;

class msg extends Exception {

    public msg  (String msg) {
        super(msg); //
    }

}

class bank {
    int accout_number;
    double balance;

    public bank(int ac, double b) {
        this.accout_number = ac;
        this.balance = b;
    }

    double deposit(double deposite) {
        balance = balance + deposite;
        return balance;
    }

    double widraw(double widraw) throws msg {
        if (balance - widraw < 1000) {
            throw new msg("Insufficient balance");
        } else {
            return balance - widraw;
        }
    }

    void diplay() {
        System.out.println("Bank Blance is: " + balance);
    }

}

public class A2 {
    public static void main(String[] args) throws msg {
        Scanner sc = new Scanner(System.in);
        int n;
        bank b = new bank(111, 2000);

        while (true) {
            System.out.println("1-diposit");
            System.out.println("2-widraw");
            System.out.println("3-diplay");
            System.out.println("4-Exit");
            System.out.print("Enter what do you what(1,2,3,4): ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter Diposit Amonut is: ");
                double d = sc.nextDouble();
                System.out.println("deposit value is: " + b.deposit(d));
            } else if (n == 2) {
                System.out.print("Enter Widraw Amonut is: ");
                double w = sc.nextDouble();
                System.out.println("Widraw afaer balnce is: " + b.widraw(w));
            } else if (n == 3) {
                b.diplay();
            } else if (n == 4) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}