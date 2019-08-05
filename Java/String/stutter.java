public String stutter(String str) {
    StringBuilder build = new StringBuilder();
    for (int i = 0 ; i < str.length(); i++) {
        build.append(str.charAt(i)).append(str.charAt(i));
    }
    return build.toString();
}
