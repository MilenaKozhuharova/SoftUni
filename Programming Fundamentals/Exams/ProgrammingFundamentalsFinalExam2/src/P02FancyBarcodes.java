import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());
        String regex = "(@#{1,})(?<word>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#{1,})";
        Pattern pattern = Pattern.compile(regex);

        List<String> validBarcodes = new ArrayList<>();

        for (int i = 1; i <= numberOfBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {

                String word = matcher.group("word");
                String productGroup = "";
                for (int j = 0; j <= word.length() - 1; j++) {

                    if (Character.isDigit(word.charAt(j))) {
                        productGroup += word.charAt(j);
                    }
                }

                if (productGroup == "") {
                    productGroup = "00";
                    validBarcodes.add(productGroup);
                    System.out.printf("Product group: %s%n", productGroup);
                } else {
                    validBarcodes.add(productGroup);
                    System.out.printf("Product group: %s%n", productGroup);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }



    }
}
