import java.util.*;
public class FibonacciSequence {
    public void FibonacciSequence(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int sum = 0;
        System.out.print("0, ");
        while (sum <= n) {
            System.out.print(prev2 + ", ");
            sum = prev1 + prev2;
            prev2 = prev1;
            prev1 = sum;
        }
        System.out.println(prev2);
    }
    public int userInput(Scanner scan) {
        System.out.print("Max value? ");
        int current = scan.nextInt();
        return current;
    }
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program lists the Fibonacci sequence.");
        int n = userInput(scan);
        
        FibonacciSequence(n);
    }
}
