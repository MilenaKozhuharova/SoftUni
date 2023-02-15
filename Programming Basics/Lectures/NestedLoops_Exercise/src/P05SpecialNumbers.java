import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        // 1111 -> 9999

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                for (int k = 1; k <= 9; k++) {
//                    for (int l = 1; l <= 9; l++) {
//                        boolean isSpecial = (n % i == 0) && (n % j == 0) && (n % k == 0) && (n % l == 0);
//
//                        if (isSpecial) {
//                            System.out.printf("%d%d%d%d ", i, j, k, l);
//                        }
//                    }
//
//                }
//
//            }
//
//        }

        for (int i = 1111; i <= 9999; i++) {
            boolean divides = true;

            int currentNum = i;
            for (int j = 1; j <= 4; j++) {

                int digit = currentNum % 10;
                if (digit == 0) {
                    divides = false;
                    continue;
                }
                if (n % digit != 0) {
                    divides = false;
                    break;
                }

                currentNum = currentNum / 10;
            }

            if (divides) {
                System.out.print(i + " ");
            }

        }
    }
}
