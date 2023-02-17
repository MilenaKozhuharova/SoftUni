import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte kegs = Byte.parseByte(scanner.nextLine());
        String biggestKeg = "";
        double biggestVolume = Double.MIN_VALUE;

        for (int i = 1; i <= kegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestKeg = model;
            }

        }
        System.out.println(biggestKeg);

    }
}
