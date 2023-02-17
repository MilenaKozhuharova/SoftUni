import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte lines = Byte.parseByte(scanner.nextLine());
        String message = "";

        for (int i = 1; i <= lines; i++) {
            char letter = scanner.nextLine().charAt(0);
            int adds = key + letter;
            message = message + (char) adds;
        }
        System.out.println(message);
    }
}
