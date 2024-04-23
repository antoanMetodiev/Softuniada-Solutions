import java.util.Scanner;

public class CoffeeCups {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = Integer.parseInt(scanner.nextLine());
    private static final String text = scanner.nextLine().toUpperCase();
    private static final int colWidth = 3 * n + 6;

    public static void main(String[] args) {
        printFirstPart();
        printSecondPart();
        printThirdPart();
    }

    private static void printFirstPart() {
        printTildes();
        printEqualSigns(); // i mean "="!
    }

     private static void printSecondPart() {
        String tildes = "";
        String emptySpaces = "";
        String tildesWithEqualLengthOfTextProperty = "";
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                emptySpaces += " ";
            }
            tildes += "~";
        }
        for (int i = 0; i < text.length(); i++) {
            tildesWithEqualLengthOfTextProperty += "~";
        }
        for (int i = 1; i <= n - 2; i++) {
            if (i == n / 2) {
                System.out.println("|" + tildes + text + tildes + "|" + emptySpaces + "|");
            } else {
                System.out.println("|" + tildes + tildesWithEqualLengthOfTextProperty + tildes + "|" + emptySpaces + "|");
            }
        }
        printEqualSigns();
    }
    
    private static void printThirdPart() {
        int monkeyACount = 6; // count for this "@", with initial 6 from them!;
        String emptySpaces = "";
        for (int i = 0; i < n - 1; i++) {
            monkeyACount += 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(emptySpaces);
            System.out.print("\\");
            for (int j = 0; j < monkeyACount; j++) {
                System.out.print("@");
            }
            System.out.println("/");
            monkeyACount -= 2;
            emptySpaces += " ";
        }
        for (int i = 0; i < colWidth - 1; i++) {
            System.out.print("-");
        }
    }

    private static void printEqualSigns() {
        for (int i = 0; i < colWidth - 1; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    private static void printTildes() {
        String emptySpacesBeforeTildes = "";
        for (int i = 0; i < n; i++) {
            emptySpacesBeforeTildes += " ";
        }
        for (int i = 0; i < n; i++) {
            System.out.print(emptySpacesBeforeTildes);
            System.out.println("~ ~ ~");
        }
    }
}
