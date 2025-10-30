public static void main(String[] args) {

    MagicCalculator calc = new MagicCalculator();
    int number1 = 12;
    int number2 = 5;

    int sum = calc.add(number1, number2);
    int difference = calc.subtract(number1, number2);
    int product = calc.multiply(number1, number2);
    double quotient = calc.divide(number1, number2);
    double average = calc.average(sum, difference, product, quotient);

    System.out.println("The sum of the numbers is: " + sum);
    System.out.println("The difference of the numbers is: " + difference);
    System.out.println("The product of the numbers is: " + product);
    System.out.println("The quotient of the numbers is: " + quotient);
    System.out.println("The average of the results is: " + average);
}
