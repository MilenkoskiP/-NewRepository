import java.util.Random;

public class MatrixPuzzle {
    private char[][] matrix;
    private Random random;

    // Constructor
    public MatrixPuzzle() {
        matrix = new char[3][3];
        random = new Random();
    }

    // Generate a 3x3 matrix of random X/O values
    public void generateMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(100);
                matrix[i][j] = (num % 2 == 0) ? 'O' : 'X';
            }
        }
    }

    // Print the matrix
    public void printMatrix() {
        for (char[] row : matrix) {
            for (char symbol : row) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    // Check for winner in rows, columns, or diagonals
    public String checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                return String.valueOf(matrix[i][0]);
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                return String.valueOf(matrix[0][j]);
            }
        }

        // Check diagonals
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
            return String.valueOf(matrix[0][0]);
        }
        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            return String.valueOf(matrix[0][2]);
        }

        return "None";
    }
}
