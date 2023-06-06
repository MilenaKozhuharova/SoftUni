import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsMap = new LinkedHashMap<>(); // за всяка кола -> км и гориво

        for (int car = 1; car <= countCars; car++) {
            String[] data = scanner.nextLine().split("\\|");
            String carModel = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);

            carsMap.putIfAbsent(carModel, new ArrayList<>());
            carsMap.get(carModel).add(0, mileage);
            carsMap.get(carModel).add(1, fuel);

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] command = input.split(" : ");

            if (command[0].equals("Drive")) {
                String car = command[1];
                int distance = Integer.parseInt(command[2]);
                int fuel = Integer.parseInt(command[3]);

                int currentFuel = carsMap.get(car).get(1);
                int currentDistance = carsMap.get(car).get(0);

                if (currentFuel >= fuel) {
                    carsMap.get(car).set(1, currentFuel - fuel);
                    carsMap.get(car).set(0, currentDistance + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (carsMap.get(car).get(0) >= 100000) {
                    System.out.printf("Time to sell the %s!%n", car);
                    carsMap.remove(car);
                }

            } else if (command[0].equals("Refuel")) {
                String car = command[1];
                int fuel = Integer.parseInt(command[2]);

                int currentFuel = carsMap.get(car).get(1);
                if (currentFuel + fuel > 75) {
                    carsMap.get(car).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", car, 75 - currentFuel);
                } else {
                    carsMap.get(car).set(1, currentFuel + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }


            } else if (command[0].equals("Revert")) {
                String car = command[1];
                int km = Integer.parseInt(command[2]);

                int currentKm = carsMap.get(car).get(0);
                int kmAfterRevert = currentKm - km;


                if (kmAfterRevert < 10000) {
                    kmAfterRevert = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, km);
                }

                carsMap.get(car).set(0, kmAfterRevert);

            }


            input = scanner.nextLine();
        }

        carsMap.entrySet().forEach(entry ->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)) );
    }
}
