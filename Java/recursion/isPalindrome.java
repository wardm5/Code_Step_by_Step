public boolean isPalindrome(String str) {
    String temp = str.toLowerCase();
    int i = 0;
    if (i == temp.length()){
        return true;
    } else {
        return isPalindrome(temp, i);
    }
}
public boolean isPalindrome(String str, int i) {
    if (i >= str.length() - 1 - i)
        return true;
    else if (str.charAt(i) == str.charAt(str.length() - 1 - i))
        return isPalindrome(str, i + 1);
    else
        return false;
}
