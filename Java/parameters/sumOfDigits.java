public int sumOfDigits(int n) {
    if (n < 0)
        n = -n;
    int temp = 0; 
    int sum = 0;
    while (n > 0) {
        temp = n % 10;
        sum += temp;
        n /= 10;
    }x
    return sum;
}
