import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    public static void printMatrix(int n) {


        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
