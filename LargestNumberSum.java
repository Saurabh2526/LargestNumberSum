import java.util.Scanner;

public class LargestNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Display the sum of the largest number
        System.out.println("The sum of the largest number is: " + largest);
        
        scanner.close();
    }
}
