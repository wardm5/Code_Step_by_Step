public int factorial (int n) {
    if (n <= 1)
        return 1;
    int total = 1;
    for (int i = 1; i <= n; i++) {
        total *= i;
    }
    return total;
}
