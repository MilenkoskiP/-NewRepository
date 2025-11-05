import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciGenerator generator = new FibonacciGenerator();

        System.out.print("Enter how many Fibonacci numbers to display: ");
        int n = input.nextInt();

        generator.printFibonacci(n);
        input.close();
    }
}