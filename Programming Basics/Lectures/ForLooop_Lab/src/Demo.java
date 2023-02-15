import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 6;
        int b = 4;
        System.out.println(n++ + --b - b-- + ++n);
    }
}
// n++ = 6
// --b = 3
// b-- = 3
// ++n = 8
// 6 + 3 - 3 + 8 = 6 + 8 = 14
