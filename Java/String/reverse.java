public String reverse(String str) {
    StringBuilder build = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
        build.append(str.charAt(i));
    }
    return build.toString();
}
