import java.util.*;
public class SentinelSum {
    //Scanner scan = new Scanner();
    int SentinelSum() {
        Scanner scan = new Scanner(System.in);
        int current = userInput(scan);
        int sum = 0;
        while (current != -1) {
            sum = current + sum;
            current = userInput(scan);
        }
        return sum;
    }
    int userInput(Scanner scan) {
        System.out.print("Type a number: ");
        
        int current = scan.nextInt();
        return current;
    }
    public void main(String[] args) {
        int sum = SentinelSum();
        System.out.println("Sum is " + sum);
    }
}
