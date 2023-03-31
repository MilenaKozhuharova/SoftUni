import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Double> productsPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] inputParts = input.split(" ");
            String product = inputParts[0];
            double price = Double.parseDouble(inputParts[1]);
            int quantity = Integer.parseInt(inputParts[2]);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity + quantity);
            }

            productsPrice.put(product, price);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String product = entry.getKey();
            double totalPrice = productsQuantity.get(product) * productsPrice.get(product);

            System.out.printf("%s -> %.2f%n", product, totalPrice);
        }

    }
}
