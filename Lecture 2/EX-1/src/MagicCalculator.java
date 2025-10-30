public class MagicCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public double average(double sum, double difference, double product, double quotient) {
        return (sum + difference + product + quotient) / 4.0;
    }
}
