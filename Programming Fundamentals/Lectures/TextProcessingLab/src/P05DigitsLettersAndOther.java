import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digitSB = new StringBuilder();
        StringBuilder lettersSB = new StringBuilder();
        StringBuilder otherSB = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)) {
                digitSB.append(symbol);

            } else if (Character.isLetter(symbol)) {
                lettersSB.append(symbol);
            } else {
                otherSB.append(symbol);
            }
        }

        System.out.println(digitSB.toString());
        System.out.println(lettersSB.toString());
        System.out.println(otherSB.toString());
    }
}
