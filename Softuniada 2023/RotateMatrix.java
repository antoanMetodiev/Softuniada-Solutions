import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = Integer.parseInt(scanner.nextLine());
    private static final int[][] inputMatrix = new int[n][n];
    private static final int[][] resultMatrix = new int[n][n];

    public static void main(String[] args) {
        fillMatrix();
        rotateMatrix();
        printMatrix();
    }

    private static void rotateMatrix() {

        //  3 11 7           3
        //  14 6 9  ->       11
        //  10 5 2           7

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                resultMatrix[j][inputMatrix.length - 1 - i] = inputMatrix[i][j];
            }
        }
    }

    private static void printMatrix() {
        Arrays.stream(resultMatrix).forEach(e -> {
            System.out.println(String.join(" ", Arrays.toString(e).replaceAll("[\\[\\],]", "")));
        });
    }

    private static void fillMatrix() {
        for (int i = 0; i < inputMatrix.length; i++) {
            inputMatrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
    }
}