public class Main {
    public static void main(String[] args) {
        MagicBox box = new MagicBox();
        MagicBoxAnalyzer analyzer = new MagicBoxAnalyzer();
        MagicBoxDisplay display = new MagicBoxDisplay();

        int[] numbers = box.getNumbers();
        display.showNumbers(numbers);

        int evens = analyzer.findEvens(numbers);
        double average = analyzer.calculateAverage(numbers);

        System.out.println("Number of even numbers: " + evens);
        System.out.printf("Average of numbers: %.2f\n", average);
    }
}