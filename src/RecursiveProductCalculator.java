import java.util.Scanner;

public class RecursiveProductCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int product = calculateProduct(numbers, 0);
        System.out.println("The product of the five numbers is: " + product);
    }

    public static int calculateProduct(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1);
        }
    }
}