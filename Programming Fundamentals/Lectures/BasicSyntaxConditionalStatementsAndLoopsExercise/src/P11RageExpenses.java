import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());

        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsets = lostGamesCount / 2;
        int mouses = lostGamesCount / 3;
        int keyboards = lostGamesCount / 6;
        int displays = keyboards / 2;


        double allSum = (headsets * headsetPrice) + (mouses * mousePrice) + (keyboards * keyboardPrice) + (displays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", allSum);
    }
}
