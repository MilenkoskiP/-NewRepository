public class FibonacciGenerator {
    public void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            if (i < n) System.out.print(", ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
