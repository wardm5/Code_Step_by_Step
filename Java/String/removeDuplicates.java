public String removeDuplicates(String str) {
    if (str.length() == 0)
        return "";
    char temp = ' ';
    StringBuilder build = new StringBuilder();
    temp = str.charAt(0);
    build.append(temp);
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) != temp)
            build.append(str.charAt(i));
        temp = str.charAt(i);
    }
    return build.toString();
}
