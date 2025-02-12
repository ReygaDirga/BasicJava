package pertemuan3;
import java.util.*;
/**
 *
 * @author dwiok
 */
public class tiktaktu {

    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        
        Scanner scanner = new Scanner(System.in);
        int moves = 0;
        boolean gameWon = false;
        char currentPlayer = 'O';
        
        while (moves < 9 && !gameWon) {
            printBoard(board);
            System.out.println("Player " + (currentPlayer == 'O' ? "1" : "2") + " move: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            
            if (x < 0 || x > 2 || y < 0 || y > 2 || board[x][y] != '-') {
                System.out.println("Invalid move, try again!");
                continue;
            }
            
            board[x][y] = currentPlayer;
            moves++;
            
            if (checkWin(board, currentPlayer)) {
                gameWon = true;
                printBoard(board);
                System.out.println("Player " + (currentPlayer == 'O' ? "1" : "2") + " wins!");
                break;
            }
            currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
        }
        
        if (!gameWon) {
            printBoard(board);
            System.out.println("It's a draw!");
        }
    }
    
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
}
