public boolean isAllVowels(String str) {
    String temp = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
        char c = temp.charAt(i);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'i' && c != 'o' && c != 'u')
            return false;
    }
    return true;
}
