import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberOfStrings];


        for (int i = 0; i < numberOfStrings; i++) {
            String sequence = scanner.nextLine(); // четем името
            int length = sequence.length(); //взимаме дължината му
            int sum = 0;

            for (int j = 0; j < sequence.length(); j++) {
                char currentChar = sequence.charAt(j); // текущ символ

                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'
                || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                    sum += currentChar * length;
                } else {
                    sum += currentChar / length;
                }
            }
            numbers[i] = sum;
        }

        for (int i = 0; i < numbers.length; i++) {
                //Swap numbers[i] with numbers[minNumberIndex]
            int minNumberIndex = i;
            int currentNumber = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minNumberIndex]) {
                    minNumberIndex = j;
                }
            }
            numbers[i] = numbers[minNumberIndex];
            numbers[minNumberIndex] = currentNumber;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
