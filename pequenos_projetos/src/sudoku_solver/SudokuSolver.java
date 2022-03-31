package sudoku_solver;

public class SudokuSolver {

    private static boolean isNumberInRow(int[][] board, int number, int row){
        for (int i = 0; i < SudokuBoard.BOARD_SIZE; i++){
            if (board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column){
        for (int i = 0; i < SudokuBoard.BOARD_SIZE; i ++){
            if (board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int column){
        // Pega o primeiro ponto de cada grupo de 9 números
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++){
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++){
                if (board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column){
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    public static boolean solveBoard(int[][] board) {
        // Resolve usando Backtracking
        /*
         0 - Quando achar uma posição que carrega o número zero:

            1 - Testar cada número entre 1 e 9, quando achar
            um número válido para a posição deve alterar
            o número zero na posição para o número válido encontrado.

            2 - Chamar recursivamente a função para verificar
            se existe uma solução válida para o sudoku a partir
            da alteração feita no passo 1

            3 - Se existe uma solução válida retorna true e retorna
            para o passo 0

            4 - Caso não, retorna os valores alterados até então para zero e
            recomeça o passo 1 com o próximo número válido para posição.
        */
        for (int i = 0; i < SudokuBoard.BOARD_SIZE; i++){
            for (int j = 0; j < SudokuBoard.BOARD_SIZE; j++){
                if (board[i][j] == 0){
                    for (int n = 1; n <= SudokuBoard.BOARD_SIZE; n++){
                        if (isValidPlacement(board, n, i , j)){
                            board[i][j] = n;

                            if (solveBoard(board)){
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}