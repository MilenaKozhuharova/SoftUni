import java.util.Scanner;

public class P02NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = n; a>=1; --a) {
            System.out.println(a);
        }
    }
}
