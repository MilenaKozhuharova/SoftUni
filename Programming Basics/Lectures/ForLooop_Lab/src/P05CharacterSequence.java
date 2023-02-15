import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int a = 0; a < text.length(); a++) {
            char letter = text.charAt(a);
            System.out.println(letter);
        }
    }
}
