import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxPoints = 0;
        String winner = "";

        while (!command.equals("Stop")) {
            String name = command;
            int result = 0;
            for (int i = 0; i < name.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                //ако числото, което четем съвпада с ascii стойността на символите от името му -> той получава 10 точки
                //ако не съвпадат -> получава 2 точки
                if (name.charAt(i) == number) {
                    result = result + 10;
                } else {
                    result = result + 2;
                }
            }
            if (result >= maxPoints) {
                maxPoints = result;
                winner = name;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
