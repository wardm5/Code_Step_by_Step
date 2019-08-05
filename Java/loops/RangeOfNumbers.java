public class RangeOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Start? ");
        int start = scan.nextInt();
        System.out.print("End? ");
        int end = scan.nextInt();
        if (start < end) {
            for (int i = start; i < end; i++) {
                System.out.print(i + ", ");
            }
            System.out.println(end);
        } else {
            for (int i = start; i > end; i--) {
                System.out.print(i + ", ");
            }
            System.out.println(end);
        }
    }
}
