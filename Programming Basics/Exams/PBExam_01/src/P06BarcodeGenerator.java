import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());

        int firstUnits = firstNum % 10;
        int firstTens = firstNum / 10 % 10;
        int firstHundreds = firstNum / 100 % 10;
        int firstThousands = firstNum / 1000;

        int secondNum = Integer.parseInt(scanner.nextLine());

        int secondUnits = secondNum % 10;
        int secondTens = secondNum / 10 % 10;
        int secondHundreds = secondNum / 100 % 10;
        int secondThousands = secondNum / 1000;

        for (int number = firstNum; number <= secondNum; number++) {

             int units = number % 10; //единици
             int tens = number / 10 % 10; //десетици
             int hundreds = number / 100 % 10; //стотици
             int thousands = number / 1000; //хилядни

            if (units % 2 != 0 && tens % 2 != 0 && hundreds % 2 != 0 && thousands % 2 != 0) {
                if (units >= firstUnits && units <= secondUnits &&
                        tens >= firstTens && tens <= secondTens &&
                        hundreds >= firstHundreds && hundreds <= secondHundreds &&
                        thousands >= firstThousands && thousands <= secondThousands) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
