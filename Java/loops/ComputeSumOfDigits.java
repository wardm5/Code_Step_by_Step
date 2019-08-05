public class ComputeSumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int val = scan.nextInt();
        System.out.println("Digit sum is " + calculate(val));
    }
    public static int calculate(int val) {
        int sum = 0;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }
        return sum;
    }
}
