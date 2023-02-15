import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double area = 0;

        if (shape.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            area = squareSide * squareSide;

        } else if (shape.equals("rectangle")) {
            double rectangleSide1 = Double.parseDouble(scanner.nextLine());
            double rectangleSide2 = Double.parseDouble(scanner.nextLine());
            area = rectangleSide1 * rectangleSide2;

        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;

        } else if (shape.equals("triangle")) {
            double triangleSide1 = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = triangleSide1 * height / 2;

        }

        System.out.printf("%.3f", area);
    }
}
