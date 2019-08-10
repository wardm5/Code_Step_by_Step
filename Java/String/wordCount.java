public int wordCount(String s1) {
    if (s1.length() == 0)
        return 0;
    if (s1.charAt(0) == ' ')
        return s1.split("[ ]+").length - 1;
    return s1.split("[ ]+").length;
}
