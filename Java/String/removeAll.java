public String removeAll(String s, char c) {
    StringBuilder build = new StringBuilder(); 
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != c)
            build.append(s.charAt(i));
    }
    return build.toString();
}
