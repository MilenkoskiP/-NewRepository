import java.util.Random;

public class MagicBox {
    private int[] numbers;

    public MagicBox() {
        numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
