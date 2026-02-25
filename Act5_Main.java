/**
 * Act5 - GigaPoints Rewards Program
 * ilagay mo pangalan mo dito!!!!!!!!
 * Date kung kailan mo ginawa itong activity!!!!!!
 */
import java.util.Scanner;

public class Act5_Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gigaPoints = 0;
        String phoneNumber;

        // Ask phone number
        System.out.print("Enter your 9-digit phone number: ");
        phoneNumber = scanner.nextLine();

        // Validate: exactly 9 digits only
        if (!phoneNumber.matches("\\d{9}")) {
            System.out.println("Invalid phone number! Must be exactly 9 digits.");
            scanner.close();
            return;
        }

        boolean continueProgram = true;

        while (continueProgram) {

            System.out.println("\nYour GigaPoints: " + gigaPoints);

            if (gigaPoints >= 99) {

                System.out.println("Choose your reward:");
                System.out.println("A - PhotoCard Set A + 1GB Data (3 days)");
                System.out.println("B - PhotoCard Set B + 1GB Data (3 days)");

                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")) {
                    gigaPoints -= 99;
                    System.out.println("Reward claimed successfully!");
                } else {
                    System.out.println("Invalid choice.");
                }

            } else {

                System.out.println("Buy 1000 load to get 98 GigaPoints? (Y/N)");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("Y")) {
                    gigaPoints += 98;
                    System.out.println("Load successful! Points added.");
                }
            }

            System.out.println("Do you want to continue? (Y/N)");
            String again = scanner.nextLine();

            if (!again.equalsIgnoreCase("Y")) {
                continueProgram = false;
            }
        }

        System.out.println("Thank you for using the program!");
        scanner.close();
    }
}
