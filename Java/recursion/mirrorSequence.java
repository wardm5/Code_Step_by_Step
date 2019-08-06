public void mirrorSequence(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1");
    } else if (n == 2) {
        System.out.print("1 1");
    } else {
        System.out.print((n + 1)/2 + " ");
        mirrorSequence(n - 2) ;
        System.out.print(" " + (n + 1)/2);
    }
}
