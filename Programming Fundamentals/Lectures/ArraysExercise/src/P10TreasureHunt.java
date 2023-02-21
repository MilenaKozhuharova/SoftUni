import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] loots = scanner.nextLine().split("\\|");
        int elementsCount = loots.length;

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) { // гледа всяка част от командата
                        boolean isMatchFound = false;
                        for (int j = 0; j < elementsCount; j++) { // гледа всяка част от loot-вете
                            if (commandParts[i].equals(loots[j])) {
                                // елемента се повтаря
                                isMatchFound = true;
                                break;
                            }
                        }

                        if (isMatchFound) {
                            continue;
                        }
                        // TODO: shift elements
                        if (elementsCount + 1 > loots.length) {
                            String[] newLoots = new String[loots.length * 2]; //нов масив -> двойно по-голям
                            for (int j = 0; j < loots.length; j++) {
                                newLoots[j] = loots[j];
                            }
                            loots = newLoots;
                        }
                        for (int j = elementsCount - 1; j >= 0; j--) {
                            loots[j + 1] = loots[j];
                        }
                        loots[0] = commandParts[i];
                        elementsCount++;

                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex < 0 || dropIndex >= elementsCount) {
                            //невалиден индекс -> няма елемент
                        break;
                    } else {
                            //валиден индекс
                            //взимаме елемента за преместване
                        String currentLoot = loots[dropIndex];
                            //местя всички елементи след моя на ляво
                        for (int leftIndex = dropIndex; leftIndex < elementsCount - 1; leftIndex++) {
                            loots[leftIndex] = loots[leftIndex + 1];
                        }
                            //слагаме накрая елемента за преместване
                        loots[elementsCount - 1] = currentLoot;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandParts[1]);
                    if (count > elementsCount) { //ако елементите са по-малко от исканите
                        count = elementsCount;
                    }

                    for (int i = elementsCount - count; i < elementsCount; i++) { //от последния елемент до искания count
                        System.out.print(loots[i]);
                        if (i != elementsCount - 1)  {
                            System.out.print(", ");
                        }
                        loots[i] = null;

                    }
                    System.out.println();
                    elementsCount -= count;
                    break;
            }


            command = scanner.nextLine();
        }


        if (elementsCount == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            int lettersCount = 0;
            for (int i = 0; i < elementsCount; i++) {
                int wordLength = loots[i].length();
                lettersCount += wordLength;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", lettersCount * 1.0 / elementsCount);
        }

    }
}
