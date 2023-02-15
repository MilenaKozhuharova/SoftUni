import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int allEggs = 0;

        while (!input.equals("Close")) {
            String buyOrFill = input;
            int eggs = Integer.parseInt(scanner.nextLine());

            if (buyOrFill.equals("Buy")) {
                if (eggs <= firstEggs) {
                    firstEggs -= eggs;
                    allEggs += eggs;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", firstEggs);
                    return;
                }

            } else if (buyOrFill.equals("Fill")) {
                firstEggs += eggs;
            }

            input = scanner.nextLine();
        }
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", allEggs);
    }
}
