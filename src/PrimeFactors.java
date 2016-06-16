import java.util.Scanner;

/**
 * Created by cxzhao on 6/5/16.
 */
public class PrimeFactors {
    public static void main(String args[]) {
        System.out.print("please enter a number N:");
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        int i;
        for (i = 2; i <= N/2; i++) {
            if (N % i == 0 && isPrime(i)) {
                System.out.println("PrimeFactors:" + i);
            }
        }
    }

    public static Boolean isPrime(Integer n) {
        int i;
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
