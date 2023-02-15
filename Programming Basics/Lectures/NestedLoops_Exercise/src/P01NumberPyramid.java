import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;
        boolean flag = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                currentNum++;

                if (currentNum > n) {
                    flag = true;
                    break;
                }

                System.out.print(currentNum + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
