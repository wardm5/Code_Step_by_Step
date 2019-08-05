public String repeat(String str, int a) {
    StringBuilder build = new StringBuilder();
    for (int i = 0; i < a; i++) {
        build.append(str);
    }
    return build.toString();
}
