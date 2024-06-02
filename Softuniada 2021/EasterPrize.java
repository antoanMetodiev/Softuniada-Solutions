import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasterPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short firstNum = Short.parseShort(scanner.nextLine());
        short secondNum = Short.parseShort(scanner.nextLine());

        List<Short> primeNumbers = new ArrayList<>();
        for (short i = firstNum; i <= secondNum; i++) {
            if (isPrime(i)) primeNumbers.add(i);
        }
        System.out.println(String.join(" ",primeNumbers.toString().replaceAll("[\\[\\],]", "")));
        System.out.printf("The total number of prime numbers between %d to %d is %d", firstNum, secondNum, primeNumbers.size());
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (short i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

