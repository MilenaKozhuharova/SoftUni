import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //>>{furniture name}<<{price}!{quantity} - валиден input
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double spentMoney = 0;
        List<String> boughtFurniture = new ArrayList<>();


        while (!input.equals("Purchase")) {
            //input = >>Sofa<<312.23!3
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                //input-a отговаря на шаблона

                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double productPrice = price * quantity;
                spentMoney += productPrice;
                boughtFurniture.add(furniture);
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : boughtFurniture) {
            System.out.println(furniture);
        }

        System.out.printf("Total money spend: %.2f", spentMoney);
    }
}
