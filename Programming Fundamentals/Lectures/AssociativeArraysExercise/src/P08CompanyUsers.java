import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> employees = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String[] inputParts = input.split(" -> ");
            String companyName = inputParts[0];
            String id = inputParts[1];
            List<String> currentCompanyEmployees = employees.get(companyName);
            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(id);

            if (!containsId) {
                employees.putIfAbsent(companyName, new ArrayList<>());
                employees.get(companyName).add(id);
            }

            input = scanner.nextLine();
        }

        employees.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
