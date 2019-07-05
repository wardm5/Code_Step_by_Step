//  The following console program is redundant. Rewrite it to use variables and expressions so that calculations are not repeated.

public class Receipt extends ConsoleProgram {
    public void run() {
        // Compute total owed, assuming 8% tax and 15% tip
        int val = (38 + 40 + 30);
        double tax = .08;
        double high_tax = .15;
        println("Subtotal: " + val);
        println("Tax: " + val * tax);
        println("Tip: " + val * high_tax);
        println("Total: " + ( (val + val * tax) + (val * high_tax)) );
    }
}
