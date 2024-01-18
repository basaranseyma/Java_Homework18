import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will continue to run until you enter an odd number. It will calculate the sum of the numbers you entered that are both even and multiples of 4.");

        do {
            System.out.print("Please enter the numbers: ");
            n = sc.nextInt();
            if (n % 2 == 0 && n % 4 == 0) { // Because 2 is evenly divisible by 2, but when divided by 4, the remainder is 2, not 0
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.print("Sum of the numbers that are both even and multiples of 4 among the entered values: " + sum);
    }
}