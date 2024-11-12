import java.util.Scanner;

public class ElementSearch {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5, 1, 12, 6}; // Example array
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the element to search
        System.out.print("Enter an element to search: ");
        int target = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Element " + target + " exists in the array.");
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }

        scanner.close();
    }
}

