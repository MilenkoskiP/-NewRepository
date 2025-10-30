import java.util.Scanner;

class TimeTravelersChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a year to check if it's a leap year (or type 'STOP' to exit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting the Time Traveler's Challenge. Safe travels!");
                break;
            }

            try {
                int year = Integer.parseInt(input);

                if (isLeapYear(year)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid year or 'STOP' to exit.");
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}
