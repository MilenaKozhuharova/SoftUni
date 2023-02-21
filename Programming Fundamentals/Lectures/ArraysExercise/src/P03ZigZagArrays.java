import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); // брой редове
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int rows = 1; rows <= n; rows++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (rows % 2 == 0) {
                    //четен ред -> първото число (втори масив); второто число (първи масив)
                firstArray[rows - 1] = secondNumber;
                secondArray[rows - 1] = firstNumber;
            } else {
                    //нечетен ред -> първото число (първи масив); второто число (втори масив)
                firstArray[rows - 1] = firstNumber;
                secondArray[rows - 1] = secondNumber;
            }
        }

        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
