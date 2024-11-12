import java.util.Scanner;

public class ElementSearch {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5, 1, 12, 6}; 
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an element to search: ");
        int target = scanner.nextInt();

        
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Element " + target + " exists in the array.");
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }

        scanner.close();
    }
}

