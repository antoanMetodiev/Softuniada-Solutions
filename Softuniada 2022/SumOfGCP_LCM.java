import java.util.Scanner;

public class SumOfGCP_LCM {
    private static final Scanner scanner = new Scanner(System.in);
    private static int firstNum;
    private static int secondNum;
    private static int biggerDivider;

    public static void main(String[] args) {
        firstNum = Integer.parseInt(scanner.nextLine());
        secondNum = Integer.parseInt(scanner.nextLine());
        findBiggerDivider();
        System.out.println(biggerDivider + findLeastCommonMultiple());
    }

    private static int findLeastCommonMultiple() {
        for (int i = 1; i < 1000000; i++) {
            if ((i / firstNum * firstNum == i) && (i / secondNum * secondNum == i)) {
                return i;
            }
        }
        return 0;
    }

    private static void findBiggerDivider() {
        for (int i = 1; i < 1000000; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                biggerDivider = i;
            }
        }
    }
}
