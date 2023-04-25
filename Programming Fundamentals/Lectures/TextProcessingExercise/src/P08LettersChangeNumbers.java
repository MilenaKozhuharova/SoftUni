import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double totalSum = 0;

        for (String code : codes) {
            //code -> "{буква}{число}{буква}" => "A12b"
            //модифицираме числото в средата и го добавяме към сумата
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);
    }

    //метод, който връща модифицираното число

    public static double getModifiedNumber (String code) {
        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(letterBefore, ' ')
                                            .replace(letterAfter, ' ')
                                            .trim());

        //проверка за буквата преди числото
        if (Character.isUpperCase(letterBefore)) {
            //главна буква - от 65 до 90
            //малка буква - от 97 до 122

            int positionUpperCase = (int)letterBefore - 64; //позицията на буквата в азбуката
            number = number / positionUpperCase;

        } else {

            int positionLowerCase = (int)letterBefore - 96;
            number = number * positionLowerCase;
        }

        //проверка за буквата след числото
        if (Character.isUpperCase(letterAfter)) {

            int positionUpperCase = (int)letterAfter - 64;
            number = number - positionUpperCase;

        } else {

            int positionLowerCase = (int)letterAfter - 96;
            number = number + positionLowerCase;
        }

        return number;
    }
}
