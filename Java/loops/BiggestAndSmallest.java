public class BiggestAndSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of numbers? ");
        int val = scan.nextInt();
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i <= val; i++) {
            System.out.print("Number " + i + ": ");
            int temp = scan.nextInt();
            if (temp > biggest)
                biggest = temp;
            if (temp < smallest)
                smallest = temp;
        }
        System.out.println("Biggest = " + biggest);
        System.out.println("Smallest = " + smallest);
    }
}
