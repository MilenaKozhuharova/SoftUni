import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int minSizeList = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSizeList; i++) {
            int firstItem = list1.get(i);
            int nextItem = list2.get(i);

            result.add(firstItem);
            result.add(nextItem);
        }

        if (list1.size() > list2.size()) {
            result.addAll(list1.subList(minSizeList, list1.size()));
        } else {
            result.addAll(list2.subList(minSizeList, list2.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
