import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int currentNum = 0;
        String flag = "odd";

        for (int i = 0; i < n; i++) {
            currentNum = numbers[i];

            if ((flag.equals("odd") && (i + 1) < n) && !(currentNum >= numbers[i + 1])) {
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = currentNum;
            } else if ((flag.equals("even") && (i + 1) < n) && !(currentNum <= numbers[i + 1])) {
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = currentNum;
            }
            
            if (flag.equals("odd")) {
                flag = "even";
                continue;
            }
            flag = "odd";
        }
        System.out.println(String.join(" ", Arrays.toString(numbers).replaceAll("[\\[\\],]", "")));
    }
}
