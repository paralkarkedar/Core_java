import java.util.Scanner;

public class FibonacciaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of terms from the user
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();

        // Initialize the first two terms
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current term

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
