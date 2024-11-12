import java.util.Scanner;

public class Element {

    public static int findLargest(int[] array) {

        int largest = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();


        int[] array = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        int largest = findLargest(array);
        System.out.println("The largest number in the array is: " + largest);

        
        scanner.close();
    }
}