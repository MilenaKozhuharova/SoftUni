package P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String type = commandParts[0];
            String model = commandParts[1];
            String color = commandParts[2];
            int horsepower = Integer.parseInt(commandParts[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);

            command = scanner.nextLine();
        }

        String input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(input)) {
                    System.out.println(vehicle);
                }
            }
            input = scanner.nextLine();
        }

        int sumCar = 0;
        int sumTruck = 0;
        int countCars = 0;
        int countTrucks = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().toLowerCase().equals("car")) {
                countCars++;
                sumCar = sumCar + vehicle.getHorsepower();
            } else if (vehicle.getType().toLowerCase().equals("truck")) {
                countTrucks++;
                sumTruck = sumTruck + vehicle.getHorsepower();
            }
        }


        double avgCars = sumCar * 1.0 / countCars;
        double avgTrucks = sumTruck * 1.0 / countTrucks;

        if (countCars == 0) {
            avgCars = 0;
        } else if (countTrucks == 0) {
            avgTrucks = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTrucks);
    }

}
