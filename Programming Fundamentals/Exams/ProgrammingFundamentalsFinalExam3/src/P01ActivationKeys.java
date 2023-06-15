import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();
        StringBuilder sb = new StringBuilder(rawActivationKey);


        String instruction = scanner.nextLine();

        while (!instruction.equals("Generate")) {
            String[] instructionParts = instruction.split(">>>");
            String action = instructionParts[0];

            if (action.equals("Contains")) {
                String substring = instructionParts[1];
                if (sb.toString().contains(substring)) {
                    System.out.printf("%s contains %s%n", sb, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (action.equals("Flip")) {
                String upperOrLower = instructionParts[1];
                int startIndex = Integer.parseInt(instructionParts[2]);
                int endIndex = Integer.parseInt(instructionParts[3]);
                String substring = sb.substring(startIndex, endIndex);

                if (upperOrLower.equals("Upper")) {
                    substring = substring.toUpperCase();
                    sb.replace(startIndex, endIndex, substring);
                    System.out.println(sb);

                } else {
                    substring = substring.toLowerCase();
                    sb.replace(startIndex, endIndex, substring);
                    System.out.println(sb);
                }


            } else if (action.equals("Slice")) {
                int startIndex = Integer.parseInt(instructionParts[1]);
                int endIndex = Integer.parseInt(instructionParts[2]);
                sb.delete(startIndex, endIndex);
                System.out.println(sb);

            }

            instruction = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", sb);
    }
}
