public class SimplePrimes {

    public static void main(String[] args) {
        System.out.println("Here are the 3-digit prime numbers:");

        for (int number = 100; number <= 999; number++) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.print(number + " ");
            }
        }
    }
}