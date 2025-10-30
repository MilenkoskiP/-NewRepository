import java.util.Random;

class FortuneTeller {
    public void generateArray(int[] arr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(101);
        }
    }

    public int countDivisibleBy(int[] arr, int divisor) {
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    public void complementArray(int[] arr, int[] complement) {
        for (int i = 0; i < arr.length; i++) {
            complement[i] = 100 - arr[i];
        }
    }

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}