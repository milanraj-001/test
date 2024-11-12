import java.util.Scanner;

public class Sum{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the length of array");
        int length = sc.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the value for index" + i + " ");
            numbers[i] = sc.nextInt();

        }
        int sum = 0;
        for(int number:numbers){
            sum +=number;

        }
        System.out.println("the sum is = " + sum);

    }



}