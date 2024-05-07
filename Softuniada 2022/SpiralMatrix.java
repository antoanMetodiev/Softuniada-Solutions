import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpiralMatrix {
    private static int rows = 0;
    private static int cols = 0;
    private static List<List<Integer>> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rows = Integer.parseInt(scanner.nextLine());
        cols = Integer.parseInt(scanner.nextLine());
        fillMatrix(scanner);
        printSpiralMatrixNumbers();
    }

    private static void printSpiralMatrixNumbers() {
        while (!numbers.isEmpty()) {
            printRight();
            if (numbers.isEmpty()) return;
            printDown();
            if (numbers.isEmpty()) return;
            printLeft();
            if (numbers.isEmpty()) return;
            printUp();
        }
    }

    private static void printUp() {
        int size = numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(size - 1 - i).remove(0) + " ");
        }
    }

    private static void printLeft() {
        List<Integer> removedNums = numbers.remove(numbers.size() - 1);
        for (int i = removedNums.size() - 1; i >= 0; i--) {
            System.out.print(removedNums.get(i) + " ");
        }
    }

    private static void printRight() {
        System.out.print(String.join(" ", numbers.remove(0).toString()
                .replaceAll("[\\[\\],]", "")));
        System.out.print(" ");
    }

    private static void printDown() {
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            System.out.print(numbers.get(i).remove(numbers.get(i).size() - 1) + " ");
        }
    }

    private static void fillMatrix(Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            numbers.add(new ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                    .collect(Collectors.toList())));
        }
    }
}
