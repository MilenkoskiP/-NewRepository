import java.util.Random;

class NumberGeneratorsSecret {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Generating 10 random numbers between 1 and 500 using a while loop:");
        int count = 0;
        while (count < 10) {
            int number = random.nextInt(500) + 1;
            System.out.print(number + " ");
            count++;
        }
        System.out.println("\n");

        System.out.println("Generating numbers using a do-while loop until a number > 300 is produced:");
        int generatedNumber;
        do {
            generatedNumber = random.nextInt(500) + 1;
            System.out.println("Generated number: " + generatedNumber);
        } while (generatedNumber <= 300);
        System.out.println();

        System.out.println("Counting even numbers in 20 trials:");
        int evenCount = 0;
        for (int i = 1; i <= 20; i++) {
            int num = random.nextInt(500) + 1;
            System.out.println("Trial " + i + ": " + num);
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Total even numbers generated: " + evenCount + "\n");

        System.out.println("Generating numbers until one divisible by 7 is found:");
        while (true) {
            int num = random.nextInt(500) + 1;
            System.out.println("Generated number: " + num);
            if (num % 7 == 0) {
                System.out.println("Number divisible by 7 found: " + num);
                break;
            }
        }
    }
}

