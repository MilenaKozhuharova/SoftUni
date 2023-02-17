import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte snowballsCount = Byte.parseByte(scanner.nextLine());
        double bestValue = Double.MIN_VALUE;
        short biggestSnowballSnow = 0;
        short biggestSnowballTime = 0;
        byte biggestSnowballlQuality = 0;

        for (int i = 1; i <= snowballsCount; i++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);

            if (snowballValue > bestValue) {
                bestValue = snowballValue;
                biggestSnowballSnow = snowballSnow;
                biggestSnowballTime = snowballTime;
                biggestSnowballlQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", biggestSnowballSnow, biggestSnowballTime, bestValue, biggestSnowballlQuality);
    }
}
