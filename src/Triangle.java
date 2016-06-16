/**
 * Created by cxzhao on 6/5/16.
 */
public class Triangle {
    public static void main(String args[]) {
        printOneAsterisk();
        printOneLineAsterisk(8);
        printOneVerticalLineAsterisk(8);
        printRightTriangle(3);
        printCenterTriangle(3);
        printDiamondTriangle(3);
        printDiamondWithName(3);
        printFizzBuzz(100);
    }

    public static void printOneAsterisk() {
        System.out.println("*");
    }

    public static void printOneLineAsterisk(Integer num) {
        int i;
        for (i = 0; i < num; i++)
            System.out.print("*");
    }

    public static void printOneVerticalLineAsterisk(Integer num) {
        int i;
        for (i = 0; i < num; i++)
            System.out.println("*");
    }

    public static void printRightTriangle(Integer num) {
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printCenterTriangle(Integer num) {
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = num; j > i; j--)
                System.out.print(" ");

            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamondTriangle(Integer num) {
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = num; j > i; j--)
                System.out.print(" ");

            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i < num; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
            for (j = 4; j > i * 2 - 1; j--)
                System.out.print("*");
            System.out.println();

        }
    }

    public static void printDiamondWithName(Integer num) {
        int i, j;
        for (i = 1; i < num; i++) {
            for (j = num; j > i; j--)
                System.out.print(" ");

            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Bill");
        for (i = 1; i < num; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
            for (j = 4; j > i * 2 - 1; j--)
                System.out.print("*");
            System.out.println();

        }
    }

    public static void printFizzBuzz(Integer num) {
        int i;
        for (i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else System.out.println(i);
        }
    }

}
