import java.util.Scanner;

public class TicTacToeUC4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int slot = -1;
        while (slot < 1 || slot > 9) {
            System.out.print("Enter a slot number (1-9): ");
            slot = scanner.nextInt();
            if (slot < 1 || slot > 9) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }
        }
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
