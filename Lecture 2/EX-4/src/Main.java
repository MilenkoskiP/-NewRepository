import java.util.Scanner;

class WeatherOracle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = scanner.nextInt();

        switch (temperature) {
            case 30:
                System.out.println("The temperature is 30 degrees, it's hot!");
                break;
            case 20:
                System.out.println("The temperature is 20 degrees, it's warm!");
                break;
            case 10:
                System.out.println("The temperature is 10 degrees, it's cool!");
                break;
            case 0:
                System.out.println("The temperature is 0 degrees, it's cold!");
                break;
            default:
                if (temperature < 0) {
                    System.out.println("It's freezing!");
                } else if
                (temperature > 30){
                    System.out.println("It's burning hot!");
                }else {
                    System.out.println("The temperature is " + temperature + " degrees.");
                }
                break;
        }

        scanner.close();
    }
}
