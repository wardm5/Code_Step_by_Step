public int binaryToDecimal(int val) {
    int base = 1;
    int result = 0;
    while (val > 0) {
        if (val % 10 != 0)
            result += base;
        base *= 2;
        val /= 10;
    }
    return result;
}
