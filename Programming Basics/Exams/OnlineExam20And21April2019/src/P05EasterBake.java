import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKozunatsi = Integer.parseInt(scanner.nextLine());
        int allSugar = 0;
        int allFlour = 0;
        double packetsSugar = 0;
        double packetsFlour = 0;
        int maxFlour = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;

        for (int i = 1; i <= countKozunatsi; i++) {
            int usedSugar = Integer.parseInt(scanner.nextLine());
            int usedFlour = Integer.parseInt(scanner.nextLine());

            if (usedFlour > maxFlour) {
                maxFlour = usedFlour;
            }
            if (usedSugar > maxSugar) {
                maxSugar = usedSugar;
            }

            allSugar += usedSugar;
            allFlour += usedFlour;

            packetsSugar = Math.ceil(allSugar * 1.0/ 950);
            packetsFlour = Math.ceil(allFlour * 1.0/ 750);
        }
        System.out.printf("Sugar: %.0f%n", packetsSugar);
        System.out.printf("Flour: %.0f%n", packetsFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
