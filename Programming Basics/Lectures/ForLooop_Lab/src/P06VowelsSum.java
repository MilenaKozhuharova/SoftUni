import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int vowels = 0;

        for (int a = 0; a <= text.length() - 1; a++) {
            char letter = text.charAt(a);
            switch (letter) {
                case 'a':
                    vowels += 1;
                    break;
                case 'e':
                    vowels += 2;
                    break;
                case 'i':
                    vowels += 3;
                    break;
                case 'o':
                    vowels += 4;
                    break;
                case 'u':
                    vowels += 5;
                    break;
            }
        }
        System.out.println(vowels);
    }
}
