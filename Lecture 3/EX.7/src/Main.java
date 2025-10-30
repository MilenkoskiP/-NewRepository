void main(){
    char[][] matrix = new char[3][3];
    ShadowMatrix shadowMatrix = new ShadowMatrix();
    ShadowGame shadowGame = new ShadowGame();

    shadowMatrix.generateMatrix(matrix);

    System.out.println("Game of Shadows Matrix:");
    shadowMatrix.printMatrix(matrix);

    int countX = shadowMatrix.countLines(matrix, 'X');
    int countO = shadowMatrix.countLines(matrix, 'O');

    shadowGame.announceWinner(countX, countO);
}