import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int numberOfInputs = 5;
        int[] numbers = new int[numberOfInputs];

        System.out.println("Welcome to the Number Total Program!");


        for (int i = 0; i < numberOfInputs; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter number " + (i + 1) + ": ");
                try {
                    numbers[i] = Integer.parseInt(scanner.nextLine());
                    totalSum += numbers[i];
                    validInput = true; // Break out of the loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                }
            }
        }


        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nTotal Sum: " + totalSum);

        scanner.close();
    }
}