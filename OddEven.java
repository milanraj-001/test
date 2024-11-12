public class OddEven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        int evenCount = 0;
        int oddCount = 0;

        
        for (int number : array) {
            if (number % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

       
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
