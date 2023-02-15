import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double prizes = rent - (rent * 0.3);
        double catering = prizes - (prizes * 0.15);
        double sound = catering / 2;

        double sum = rent + prizes + catering + sound;

        System.out.printf("%.2f", sum);
    }
}
