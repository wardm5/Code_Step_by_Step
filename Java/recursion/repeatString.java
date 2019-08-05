public String repeatString(String str, int n) {
    if (n < 0)
        throw new IllegalArgumentException();
    if (n == 0)
        return "";
    if (n == 1) 
        return str;
    else
        return repeatString(str, n - 1) + str;
}
