package sudoku_solver;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SudokuBoard {

    public static final int BOARD_SIZE = 9;

    private static int[] getLine(Scanner sc){
        System.out.print("Digite a próxima linha (apenas números): ");
        String lineString = sc.nextLine();
        var line = new int[BOARD_SIZE];
        for (int i = 0; i < lineString.length(); i++){
            line[i] = Integer.parseInt(Character.toString(lineString.charAt(i)));
        }
        return line;
    }

    public static int[][] getBoard(){
        var board = new int[BOARD_SIZE][BOARD_SIZE];
        var sc = new Scanner(System.in);
        for (int i = 0; i < BOARD_SIZE; i++){
            board[i] = getLine(sc);
        }
        sc.close();
        return board;
    }

    public static void printBoard(int[][] board){
        for (int[] line : board){
            System.out.println(Arrays.toString(line));
        }
    }
}
