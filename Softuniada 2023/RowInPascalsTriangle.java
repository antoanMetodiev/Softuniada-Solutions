import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowInPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> pascalNumbers = new ArrayList<>();

        for (int i = 1; i <= n + 1; i++) {

            List<Integer> numbers = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    numbers.add(1);
                } else {
                    int createdNumber = pascalNumbers.get(i - 2).get(j - 2) + pascalNumbers.get(i - 2).get(j - 1);
                    numbers.add(createdNumber);
                }
            }
            pascalNumbers.add(numbers);
        }
        System.out.println(String.join(" ", pascalNumbers.get(n).toString().replaceAll("[\\[\\],]", "")));
    }
}
