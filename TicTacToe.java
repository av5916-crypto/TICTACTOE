/**
 * TicTacToe
 * UC1 initializes and displays an empty Tic-Tac-Toe board in a proper
 * grid format. This use case introduces 2D arrays, nested loops,
 * and formatted console output.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. It initializes the board and prints
     * the empty grid on the console.
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Initializes the 3x3 board by filling each cell with '-' to indicate
     * an empty position. Students should focus on correct nested loop usage.
     */
    static void initializeBoard() {
        // Outer loop iterates over each row (0, 1, 2)
        for (int row = 0; row < 3; row++) {
            // Inner loop iterates over each column (0, 1, 2)
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-'; // Mark cell as empty
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board using horizontal and vertical separators
     * so that the grid structure is clearly visible to the user.
     */
    static void printBoard() {
        System.out.println("--------------");
        for (int row = 0; row < 3; row++) {
            // Print each cell in the row with spacing
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + board[row][col]);
                // Print vertical separator between columns (not after last)
                if (col < 2) {
                    System.out.print(" |");
                }
            }
            System.out.println(); // Move to next line after each row
            // Print horizontal separator between rows (not after last)
            if (row < 2) {
                System.out.println("-----------");
            }
        }
        System.out.println("--------------");
    }
}
