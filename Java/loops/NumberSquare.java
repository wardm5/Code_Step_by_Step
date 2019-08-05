public class NumberSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Min? ");
        int min = scan.nextInt();
        System.out.print("Max? ");
        int max = scan.nextInt();
        int printVal = min;
        for (int i = min; i <= max; i++) {
            printVal = i;
            for (int j = min; j <= max; j++) {
                if (printVal > max)
                    printVal = min;
                System.out.print(printVal);
                printVal++;
            }
            System.out.println();
        }
    }
}
