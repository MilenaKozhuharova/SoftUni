import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allStops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(allStops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

            String[] commandParts = command.split(":");

            if (commandParts[0].equals("Add Stop")) {
                int index = Integer.parseInt(commandParts[1]);
                String stopName = commandParts[2];

                if (isIndexValid(index, stopsBuilder)) {
                    stopsBuilder.insert(index, stopName);
                }

            } else if (commandParts[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);

                if (isIndexValid(startIndex, stopsBuilder) && isIndexValid(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }

            } else if (commandParts[0].equals("Switch")) {
                String oldString = commandParts[1];
                String newString = commandParts[2];

                if (stopsBuilder.toString().contains(oldString)) {
                    String updatedString = stopsBuilder.toString().replace(oldString, newString);
                    stopsBuilder = new StringBuilder(updatedString);
                }
            }

            System.out.println(stopsBuilder.toString());

            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder.toString());
    }

    public static boolean isIndexValid (int index, StringBuilder stopsBuilder) {

        return index >= 0 && index <= stopsBuilder.length() - 1;
    }
}
