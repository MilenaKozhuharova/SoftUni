import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesAnHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int allTime = pages / pagesAnHour;
        int neededHours = allTime / days;

        System.out.println(neededHours);
    }
}
