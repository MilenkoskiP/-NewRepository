public class EndlessLoop {
    public void startLoop() {
        System.out.println("Starting the Endless Loop of Doom using a for loop:\n");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("Iteration " + i + " is divisible by 2. Skipping print.");
                continue;
            }

            if (i == 7) {
                System.out.println("Iteration " + i + " reached. Breaking out of the loop.");
                break;
            }

            System.out.println("Iteration " + i + ": Printing number " + i);
        }
    }

    public void explain() {
        System.out.println("\nExplanation:");
        System.out.println("- The 'continue' statement skips the rest of the loop when a condition is met.");
        System.out.println("- The 'break' statement immediately ends the loop when triggered.");
    }
}
