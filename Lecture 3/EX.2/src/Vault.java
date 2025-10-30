import java.util.Random;

public class Vault {
    private int[] A = new int[15];
    private int[] B = new int[15];
    private int divisibleBy3Count = 0;
    private Random random = new Random();

    public void fillArray() {
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(101); // 0 to 100
        }
    }

    public void countDivisibleBy3() {
        for (int num : A) {
            if (num % 3 == 0) {
                divisibleBy3Count++;
            }
        }
    }

    public void createComplementArray() {
        for (int i = 0; i < A.length; i++) {
            B[i] = 100 - A[i];
        }
    }

    public void displayResults() {
        System.out.println("Array A (Original Numbers):");
        printArray(A);
        System.out.println("\nArray B (Complements):");
        printArray(B);
        System.out.println("\nNumbers in Array A divisible by 3: " + divisibleBy3Count);
    }

    private void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
