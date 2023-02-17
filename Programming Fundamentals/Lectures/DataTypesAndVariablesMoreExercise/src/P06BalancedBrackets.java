import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        boolean open = false;
        boolean closed = false;

        for (int i = 0; i < n; i++) {
            String currentLine = scanner.nextLine();

            if (currentLine.equals("(") && open && closed) {
                open = false;
                closed = false;
            }

            if (currentLine.equals(")") && !open) {
                break;
            }

            if (currentLine.equals("(")) {
                if (open) {
                    open = false;
                    break;
                }
                open = true;
            }

            if (open) {
                if (currentLine.equals(")")) {
                    closed = true;
                }
            }
        }
        if (open && closed) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
