void main(){
    int size = 10;
    int divisor = 5;
    int[] originalArray = new int[size];
    int[] complementArray = new int[size];

    FortuneTeller teller = new FortuneTeller();

    teller.generateArray(originalArray, size);
    System.out.println("Original Array:");
    teller.printArray(originalArray);

    int countDivisible = teller.countDivisibleBy(originalArray, divisor);
    System.out.println("Numbers divisible by " + divisor + ": " + countDivisible);

    teller.complementArray(originalArray, complementArray);
    System.out.println("Complement Array:");
    teller.printArray(complementArray);
}