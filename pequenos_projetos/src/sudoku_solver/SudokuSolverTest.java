package sudoku_solver;

public class SudokuSolverTest {

    public static void main(String[] args) {
         int[][] board = SudokuBoard.getBoard();
         System.out.println("Board");
         SudokuBoard.printBoard(board);

         if (SudokuSolver.solveBoard(board)) {
             System.out.println("Board is solved!");
         } else {
             System.out.println("Board can not be solved!");
         }

         SudokuBoard.printBoard(board);

    }
}
