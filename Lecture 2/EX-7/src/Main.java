import java.util.Random;
import java.util.Scanner;

class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int treasureX = random.nextInt(10) + 1;
        int treasureY = random.nextInt(10) + 1;

        System.out.println("Welcome to the Treasure Hunt!");
        System.out.println("Guess the treasure's location on a 10x10 grid (coordinates 1-10).");
        System.out.println("You have 7 attempts to find the treasure.");

        boolean found = false;
        int previousDistance = Integer.MAX_VALUE;

        for (int attempt = 1; attempt <= 7; attempt++) {
            System.out.println("\nAttempt " + attempt + ":");

            int guessX = getValidCoordinate(scanner, "X");
            int guessY = getValidCoordinate(scanner, "Y");

            int currentDistance = Math.abs(treasureX - guessX) + Math.abs(treasureY - guessY);

            if (guessX == treasureX && guessY == treasureY) {
                System.out.println("Congratulations! You've found the treasure at (" + treasureX + ", " + treasureY + ")!");
                found = true;
                break;
            } else {
                if (attempt > 1) {
                    if (currentDistance < previousDistance) {
                        System.out.println("You are getting closer!");
                    } else if (currentDistance > previousDistance) {
                        System.out.println("You are further away!");
                    } else {
                        System.out.println("You are at the same distance as before!");
                    }
                } else {
                    System.out.println("Too far! Try again!");
                }
                previousDistance = currentDistance;
            }
        }

        if (!found) {
            System.out.println("\nGame over! The treasure was at (" + treasureX + ", " + treasureY + ").");
        }

        scanner.close();
    }

    private static int getValidCoordinate(Scanner scanner, String axis) {
        int coordinate = 0;
        while (true) {
            System.out.print("Enter your guess for " + axis + " (1-10): ");
            String input = scanner.nextLine();
            try {
                coordinate = Integer.parseInt(input);
                if (coordinate >= 1 && coordinate <= 10) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return coordinate;
    }
}
