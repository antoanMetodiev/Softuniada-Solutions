import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestValidParentheses {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> allValidBrackets = new ArrayList<>();
    private static final String input = scanner.nextLine();
    private static String validBrackets = "";  // for each iteration!
    

    public static void main(String[] args) {
        findLongestValidBracketSequenceLength();
        printResult();
    }

    private static void printResult() {
        int lastIndex = input.length();
        if (input.charAt(lastIndex - 2) == '(' && input.charAt(lastIndex - 1) == ')') {
            allValidBrackets.add(validBrackets);
        }

        System.out.println(allValidBrackets.stream().sorted((e1, e2) ->
                Integer.compare(e2.length(), e1.length())).collect(Collectors.toList()).get(0).length());
    }

    private static void findLongestValidBracketSequenceLength() {

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == '(' && input.charAt(i + 1) == ')') {
                i++;
                validBrackets += "()";
                continue;
            }

            allValidBrackets.add(validBrackets);
            validBrackets = "";
        }
    }
}