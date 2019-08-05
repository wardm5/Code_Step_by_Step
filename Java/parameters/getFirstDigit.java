public int getFirstDigit (int n) {
    if (n < 0)
        n = -n;
    int temp = 0;
    while (n > 0) {
        temp = n % 10;
        n /= 10;
    }
    return temp;
}
