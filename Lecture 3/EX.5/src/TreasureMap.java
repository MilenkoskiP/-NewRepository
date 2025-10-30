import java.util.Random;

class TreasureMap {
    private int[][] map;
    private int[] rowSums;
    private final int rows = 5;
    private final int cols = 10;

    public TreasureMap() {
        map = new int[rows][cols];
        rowSums = new int[rows];
    }

    public void generateMap() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = random.nextInt(101);
            }
        }
    }

    public void printMap() {
        System.out.println("Treasure Map (5x10 Matrix):");
        for (int[] row : map) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public void calculateRowSums() {
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += map[i][j];
            }
            rowSums[i] = sum;
        }
    }

    public void printRowSums() {
        System.out.println("\nRow Sums:");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
        }
    }
}
