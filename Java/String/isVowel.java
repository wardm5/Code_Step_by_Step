public boolean isVowel(String str) {
    str = str.toLowerCase();
    return (str.length() == 1 && (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u'));
}

