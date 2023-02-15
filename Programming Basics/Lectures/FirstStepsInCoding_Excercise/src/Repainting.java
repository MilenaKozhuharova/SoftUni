import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylon + 2) * 1.50;
        double paintCost = (paint + (paint * (10 / 100.0))) * 14.50;
        double diluentCost = diluent * 5;
        double bags = 0.40;

        double allMaterials = nylonCost + paintCost + diluentCost + bags;
        double workers = (allMaterials * (30 / 100.0)) * hours;
        double total = allMaterials + workers;

        System.out.println(total);
    }
}
