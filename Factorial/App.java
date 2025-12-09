import java.util.Scanner;

public class App{
    public static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate the factorial: ");
        int num = scanner.nextInt();

        if (num  < 0 ) {
            System.out.println("Cannot factorise a negative number.");

        } else {
            int result = factorial(num);
            System.out.println(num + "! =" + result);
        }
    }
}