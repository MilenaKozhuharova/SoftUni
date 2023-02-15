import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxColour = "";

        for (int i = 1; i <= eggs; i++) {
            String colour = scanner.nextLine();
            if (colour.equals("red")) {
                red++;
            } else if (colour.equals("orange")) {
                orange++;
            } else if (colour.equals("blue")) {
                blue++;
            } else if (colour.equals("green")) {
                green++;
            }
            if (red >= maxEggs) {
                maxEggs = red;
                maxColour = "red";
            }
            if (orange >= maxEggs) {
                maxEggs = orange;
                maxColour = "orange";
            }
            if (blue >= maxEggs) {
                maxEggs = blue;
                maxColour = "blue";
            }
            if (green >= maxEggs) {
                maxEggs = green;
                maxColour = "green";
            }
        }



        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxColour);
    }
}
