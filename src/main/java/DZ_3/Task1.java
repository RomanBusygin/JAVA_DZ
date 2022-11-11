package DZ_3;

import java.util.Arrays;

public class Task1 {
    static int n = 5;
    static int[][] board = new int[n][n];
    static int[][] moves = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};
    static int startRow = 0;
    static int startCol = 0;
    static int countSolves = 0;

    public static void main(String[] args) {
        horseMove(board, startRow, startCol, 1);
        if (countSolves == 0) System.out.println("Решений нет");
    }

    public static void horseMove(int[][] board, int posRow, int posCol, int count) {
        board[posRow][posCol] = count;
        if (count == n*n) {
            printBoard(board);
            countSolves++;
            board[posRow][posCol] = 0;
            return;
        }
        for (int[] move : moves) {
            int newRow = posRow + move[0];
            int newCol = posCol + move[1];
            if ((newRow >= 0) && (newRow < n) && (newCol >= 0) && (newCol < n) && (board[newRow][newCol] == 0)) horseMove(board, newRow, newCol, count + 1);
        }
        board[posRow][posCol] = 0;
    }

    private static void printBoard(int[][] board) {
        for (int[] str : board) {
            System.out.println(Arrays.toString(str));
        }
        System.out.println();
    }
}
