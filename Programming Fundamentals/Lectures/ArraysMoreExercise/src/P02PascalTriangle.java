import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        int[] previousRow = new int[1];

        for (int row = 0; row < n; row++) {
            int[] currentRow = new int[row + 1];

            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    currentRow[column] = 1;
                } else {
                    currentRow[column] = previousRow[column - 1] + previousRow[column];
                }
            }

            for (int i = 0; i < currentRow.length; i++) {
                System.out.print(currentRow[i] + " ");
            }

            System.out.println();
            previousRow = currentRow;
        }

    }
}
