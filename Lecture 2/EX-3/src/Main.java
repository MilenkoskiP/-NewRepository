import java.util.Random;
class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int score = random.nextInt(101); // 0 to 100
        System.out.println("Generated Score: " + score);

        if (score >= 60) {
            System.out.println("You have passed the exam!");
        } else {
            System.out.println("You have failed the exam.");
        }
    }
}