double sumUpTo(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1.0;
    } else {
        return (1.0 / n) + sumUpTo(n - 1);
    }
}
