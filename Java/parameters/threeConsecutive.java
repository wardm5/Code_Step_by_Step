public boolean threeConsecutive(int a, int b, int c) {
    if (a == b || b == c)
        return false;
    return (a - b == -1 || a - b == 1 && b - c == -1 || b - c == 1 && a - c == 1 || a - c == -1);
}
