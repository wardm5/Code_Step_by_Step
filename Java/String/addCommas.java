public String addCommas(String str) {
    StringBuilder build = new StringBuilder();
    int count = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
        if (count < 3) {
            build.insert(0, str.charAt(i));
        } else if (count == 3) {
            build.insert(0, ",").insert(0, str.charAt(i));
            count = 0;
        }
        count++;
    }
    return build.toString();
}
