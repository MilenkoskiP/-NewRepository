import java.util.Random;

class ShadowMatrix {
    public void generateMatrix(char[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextBoolean() ? 'X' : 'O';
            }
        }
    }

    public void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char symbol : row) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public int countLines(char[][] matrix, char symbol) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == symbol && matrix[i][1] == symbol && matrix[i][2] == symbol) {
                count++;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == symbol && matrix[1][j] == symbol && matrix[2][j] == symbol) {
                count++;
            }
        }

        if (matrix[0][0] == symbol && matrix[1][1] == symbol && matrix[2][2] == symbol) {
            count++;
        }

        if (matrix[0][2] == symbol && matrix[1][1] == symbol && matrix[2][0] == symbol) {
            count++;
        }

        return count;
    }
}

class ShadowGame {
    public void announceWinner(int countX, int countO) {
        if (countX > countO) {
            System.out.println("Player 'X' wins with " + countX + " line(s)!");
        } else if (countO > countX) {
            System.out.println("Player 'O' wins with " + countO + " line(s)!");
        } else {
            System.out.println("It's a tie! No winner.");
        }
    }
}