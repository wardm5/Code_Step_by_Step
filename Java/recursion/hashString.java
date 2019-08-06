public String hashString(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return "#";
    } else {
        return hashString(n - 1) + hashString(n - 1);
    }
}
