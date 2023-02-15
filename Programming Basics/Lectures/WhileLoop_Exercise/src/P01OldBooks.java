import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        int count = 0;
        boolean wasFound = false;
        String input = scanner.nextLine();

        while (!input.equals("No More Books")) {
            String currentBook = input;

            if (currentBook.equals(bookName)) {
                wasFound = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }

        if (wasFound) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }
    }
}
