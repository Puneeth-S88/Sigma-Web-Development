import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Traversal
        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}