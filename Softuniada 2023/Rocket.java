import java.util.Scanner;

public class Rocket {
    private static int n = 0;
    private static boolean firstPartIsFinal = false;
    private static int dotCount = 0;  // for col

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        printFirstPart();  // <<- around the dots!
        printSecondPart();
        printThirdPart();
    }

    private static void printFirstPart() {
        int endIndex = (n + 5 - 1) / 2;
        printHeaderOfTheFirstPart(endIndex);  // 90% similar for every case! (underscores are not).
        endIndex -= 2;

        for (int i = 0; i < n; i++) {

            printUnderscores(endIndex);
            printTheMiddleOfTheCol();
            printUnderscores(endIndex);
            endIndex--;

            if (firstPartIsFinal) {
                break;
            } else {
                System.out.println();
            }
        }
    }

    private static void printSecondPart() {
        System.out.print("_");
        dotCount = (n / 2) - 1;
        printTheMiddleOfTheCol();
        System.out.print("_");
        System.out.println();

        double endIndex = Math.floor((double) (n + 5 - 3) / 2);
        for (int i = 0; i < n; i++) {
            printUnderscores(endIndex);
            System.out.print("|||");
            printUnderscores(endIndex);
            System.out.println();
        }
    }

    private static void printThirdPart() {
        int endIndex = (n + 5 - 3) / 2;
        printUnderscores(endIndex);
        System.out.print("~~~");
        printUnderscores(endIndex);
        System.out.println();
        endIndex--;

        for (int i = 0; i < n / 2; i++) {
            printUnderscores(endIndex);
            System.out.print("//");
            printDots(i);
            System.out.print("!");
            printDots(i);
            System.out.print("\\\\");
            printUnderscores(endIndex);
            System.out.println();
            endIndex--;
        }
    }

    private static void printHeaderOfTheFirstPart(int endIndex) {
        // First row:
        printUnderscores(endIndex);
        System.out.print("^");
        printUnderscores(endIndex);
        endIndex--;
        System.out.println();

        // Second row:
        printUnderscores(endIndex);
        System.out.print("/|\\");
        printUnderscores(endIndex);
        endIndex--;
        System.out.println();
    }

    private static void printTheMiddleOfTheCol() {
        if (dotCount * 2 <= n) {
            System.out.print("/");
            printDots(dotCount);
            System.out.print("|||");
            printDots(dotCount);
            System.out.print("\\");
            dotCount++;
        } else {
            firstPartIsFinal = true;
        }
    }

    private static void printDots(int dotCount) {
        for (int i = 0; i < dotCount; i++) {
            System.out.print(".");
        }
        if (dotCount / 2 == n) {
            firstPartIsFinal = true;
        }
    }

    private static void printUnderscores(double endIndex) {
        for (int i = 0; i < endIndex; i++) {
            System.out.print("_");
        }
    }
}
