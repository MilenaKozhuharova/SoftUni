import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieces = new LinkedHashMap<>();

        for (int piece = 1; piece <= numberOfPieces; piece++) {
            String[] pieceComposerKey = scanner.nextLine().split("\\|");
            String pieceName = pieceComposerKey[0];
            String composer = pieceComposerKey[1];
            String key = pieceComposerKey[2];

            pieces.put(pieceName, new ArrayList<>());
            pieces.get(pieceName).add(0, composer);
            pieces.get(pieceName).add(1, key);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");

            if (commandParts[0].equals("Add")) {
                String piece = commandParts[1];
                String composer = commandParts[2];
                String key = commandParts[3];

                if (pieces.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    pieces.put(piece, new ArrayList<>());
                    pieces.get(piece).add(0, composer);
                    pieces.get(piece).add(1, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);

                }
            } else if (commandParts[0].equals("Remove")) {
                String piece = commandParts[1];

                if (pieces.containsKey(piece)) {
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (commandParts[0].equals("ChangeKey")) {
                String piece = commandParts[1];
                String newKey = commandParts[2];

                if (pieces.containsKey(piece)) {
                    pieces.get(piece).add(1, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }
            command = scanner.nextLine();
        }

        pieces.entrySet().forEach(entry ->
                System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
