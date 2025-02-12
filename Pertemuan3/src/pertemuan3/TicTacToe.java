package Pertemuan3;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'O'; 
        int moves = 0;

        System.out.println("Tic Tac Toe Game");
        while (true) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column, 1-3): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move. Try again!");
                continue;
            }

            board[row][col] = currentPlayer;
            moves++;

            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (moves == 9) {
                printBoard(board);
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
