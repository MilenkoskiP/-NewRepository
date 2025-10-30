void main() {
    MatrixPuzzle puzzle = new MatrixPuzzle();
    System.out.println("Welcome to the Matrix Puzzle!");
    puzzle.generateMatrix();
    puzzle.printMatrix();

    String winner = puzzle.checkWinner();

    if (winner.equals("X") || winner.equals("O")) {
        System.out.println("Player '" + winner + "' wins!");
    } else {
        System.out.println("There is no winner.");
    }
}