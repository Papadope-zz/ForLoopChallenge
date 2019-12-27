package forloop;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println("Number " + i + " is a prime number!");
                if (counter == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
