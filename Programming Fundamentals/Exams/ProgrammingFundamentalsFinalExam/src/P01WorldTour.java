import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allStops = scanner.nextLine();
        StringBuilder modifiedStops = new StringBuilder(allStops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");

            if (commandParts[0].equals("Add Stop")) {
                int index = Integer.parseInt(commandParts[1]);
                String string = commandParts[2];

                if (isIndexValid(index, modifiedStops)) {
                    modifiedStops.insert(index, string);
                }

            } else if (commandParts[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);

                if (isIndexValid(startIndex, modifiedStops) && isIndexValid(endIndex, modifiedStops)) {
                    modifiedStops.delete(startIndex, endIndex + 1);
                }


            } else if (commandParts[0].equals("Switch")) {
                String oldString = commandParts[1];
                String newString = commandParts[2];

                String currentStops = modifiedStops.toString();

                if (currentStops.contains(oldString)) {
                    currentStops = currentStops.replace(oldString, newString);
                    modifiedStops = new StringBuilder(currentStops);
                }

            }
            System.out.println(modifiedStops.toString());


            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", modifiedStops.toString());
    }
    public static boolean isIndexValid (int index, StringBuilder modifiedStops){
        return index >= 0 && index <= modifiedStops.length() - 1;
    }
}
