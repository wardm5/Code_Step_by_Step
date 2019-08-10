public boolean isPalindrome(String str) {
    for (int i = 0; i < str.length()/2; i++) {
        if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - 1 - i)))
            return false;
    }
    return true;
}
