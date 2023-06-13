import java.util.*;
import java.util.regex.Matcher;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> cars = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            String car = carInfo[0];
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);

            cars.put(car, new ArrayList<>());
            cars.get(car).add(0, mileage);
            cars.get(car).add(1, fuel);
        }

        String command = scanner.nextLine();


        while (!command.equals("Stop")) {
            String[] commandParts = command.split(" : ");

            if (commandParts[0].equals("Drive")) {
                String car = commandParts[1];
                int distance = Integer.parseInt(commandParts[2]);
                int fuel = Integer.parseInt(commandParts[3]);

                if (cars.get(car).get(1) < fuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int currentFuel = cars.get(car).get(1);
                    cars.get(car).set(1, currentFuel - fuel);
                    int currentMileage = cars.get(car).get(0);
                    cars.get(car).set(0, currentMileage + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                }

                if (cars.get(car).get(0) >= 100000) {
                    System.out.printf("Time to sell the %s!%n", car);
                    cars.remove(car);
                }

            } else if (commandParts[0].equals("Refuel")) {
                String car = commandParts[1];
                int fuel = Integer.parseInt(commandParts[2]);

                int currentFuel = cars.get(car).get(1);
                if (currentFuel + fuel >= 75) {
                    cars.get(car).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", car, 75 - currentFuel);
                } else {
                    cars.get(car).set(1, currentFuel + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }

            } else if (commandParts[0].equals("Revert")) {
                String car = commandParts[1];
                int km = Integer.parseInt(commandParts[2]);

                int currentKm = cars.get(car).get(0);
//                cars.get(car).set(0, currentKm - km);
//                System.out.printf("%s mileage decreased by %d kilometers%n",car, km);
//
//                if (cars.get(car).get(0) < 10000) {
//                    cars.get(car).set(0, 10000);
//                }
                int kmAfterRevert = currentKm - km;
                if (kmAfterRevert < 10000) {
                    kmAfterRevert = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n",car, km);
                }

                cars.get(car).set(0, kmAfterRevert);

            }

            command = scanner.nextLine();
        }
        cars.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}
