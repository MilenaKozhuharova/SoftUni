import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = Byte.parseByte(scanner.nextLine());
        short capacity = 255;
        short waterSum = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            short water = Short.parseShort(scanner.nextLine());
            waterSum += water;

            if (waterSum > capacity) {
                System.out.println("Insufficient capacity!");
                waterSum -= water;
            }
        }

        System.out.println(waterSum);
    }
}
