import java.util.Random;

public class TicTacToeUC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random random = new Random();
        int slot, row, col;

        do {
            slot = random.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
        } while (!isValidMove(row, col));

        board[row][col] = computerSymbol;
        System.out.println("Computer placed '" + computerSymbol + "' at slot " + slot + " (row=" + row + ", col=" + col + ")");
    }

    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == '-';
    }
}
