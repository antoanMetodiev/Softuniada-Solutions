import java.util.Scanner;

public class SumOfGCP_LCM {
    private static int biggerDivider;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        findBiggerDivider(firstNum, secondNum);
        System.out.println(biggerDivider + findLeastCommonMultiple(firstNum, secondNum));
    }

    private static int findLeastCommonMultiple(int firstNum, int secondNum) {
        for (int i = 1; i < 1000000; i++) {
            if ((i / firstNum * firstNum == i) && (i / secondNum * secondNum == i)) return i;
        }
        return 0;
    }

    private static void findBiggerDivider(int firstNum, int secondNum) {
        for (int i = 1; i < 1000000; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) biggerDivider = i;
        }
    }
}
